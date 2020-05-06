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
		
	}
	
	public void log(String message)
	{
		try 
		{
			PrintWriter out = new PrintWriter(outFile);
			out.println(message);
			out.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found exception!");
		}

	}
	
	public String getFilename()
	{
		return this.filename;
	}
	
	public File getFile()
	{
		return this.outFile;
	}
	
}
