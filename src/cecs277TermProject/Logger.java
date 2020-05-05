package cecs277TermProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Logger is simply our file I/O class, meant to write to the transaction log.
 */
public class Logger 
{
	private volatile static Logger logger;
	private String filename;
	private File outFile;
	private PrintWriter out;
	
	public Logger getLogger() throws FileNotFoundException
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
		out.println(message);
	}
	
	public String getFilename()
	{
		return this.filename;
	}
	
}
