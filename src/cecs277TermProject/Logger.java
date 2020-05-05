package cecs277TermProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Logger is simply our file I/O class, meant to write to the transaction log.
 */
public class Logger 
{
	
	private File outFile;
	private PrintWriter out;
	
	public Logger(File outFile) throws FileNotFoundException
	{
		this.outFile = outFile;
		out = new PrintWriter(outFile);
	}
	
	public void log(String message)
	{
		out.println(message);
	}
	
	
}
