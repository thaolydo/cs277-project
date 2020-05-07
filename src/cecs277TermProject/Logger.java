package cecs277TermProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Logger is simply our file I/O class, meant to write to the transaction log.
 */
public class Logger
{
	private volatile static Logger logger;
	private String filename;
	private File outFile;
	PrintWriter out;

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

	public void log(String message)
	{
		Instant time = Instant.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss:SSS")
			.withLocale( Locale.US )
			.withZone( ZoneId.of("UTC"));
		String timestamp = format.format(time);

		out.println(String.format("[%1$s] %2$s", timestamp, message));
	}

	public String getFilename()
	{
		return this.filename;
	}

	public File getFile()
	{
		return this.outFile;
	}

	public void closeLogger()
	{
		out.close();
	}

}
