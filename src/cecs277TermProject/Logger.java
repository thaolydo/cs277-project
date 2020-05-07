package cecs277TermProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Logger is simply our file I/O class, meant to write to the transaction log. It uses the singleton design pattern, and creates an output file in
 * the project's main directory.
 */
public class Logger 
{
	private volatile static Logger logger;
	private String filename;
	private File outFile;
	PrintWriter out;

	/**
	 * getLogger() is how to access the logger member variable, as in the singleton design pattern.  If logger is null, it will create a new one.
	 * @return This logger
	 * @throws FileNotFoundException An invalid file is created.
	 */
	public static Logger getLogger() throws FileNotFoundException

	{
		if (Logger.logger == null)
		{
			synchronized(Logger.class)
			{
				if(Logger.logger == null)
				{
					Logger.logger = new Logger();
				}
			}
		}
		return Logger.logger;
	}

	private Logger() throws FileNotFoundException
	{
		this.filename = "roach_motel_log.txt";
		this.outFile = new File(filename);
		out = new PrintWriter(outFile);
	}

	/**
	 * Writes an entry to the log, prefaced by a timestamp of when it was written.  Any message can be passed in here.
	 * @param message The message to write out to the log.
	 */
	public void log(String message)
	{
		Instant time = Instant.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss:SSS");
		String timestamp = format.format(time);
		
		out.println(String.format("[%1$s] %2$s", timestamp, message));
	}

	/**
	 * Gets the filename of the output file.
	 * @return file name of the output file.
	 */
	public String getFilename()
	{
		return this.filename;
	}

	/**
	 * Gets the file object of the output file itself.
	 * @return The output file itself.
	 */
	public File getFile()
	{
		return this.outFile;
	}

	/**
	 * Closes the logger's printwriter, effectively turning this class off.
	 */
	public void closeLogger()
	{
		out.close();
	}
	
}
