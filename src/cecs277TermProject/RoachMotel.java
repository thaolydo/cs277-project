package cecs277TermProject;

import java.util.ArrayList;


/**
 * This is the Roach motel.  It will use the Singleton design pattern.  We will set the capacity and name in the constructor.
 * @author Tyler V
 *
 */
public class RoachMotel
{
	private volatile static RoachMotel motel;
	private int capacity;
	private boolean vacancy;
	private ArrayList<Integer> availableRooms; //This is a list of the room numbers available.
	private String name;
	
	public RoachMotel(String name, int Capacity)
	{
		this.name = name;
		this.capacity = capacity;
		this.vacancy = true;
	}
	
	@Override
	public String toString()
	{
		return "This is a placeholder return";
	}
	
	
	
}
