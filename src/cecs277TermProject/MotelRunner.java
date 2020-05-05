package cecs277TermProject;

import java.io.FileNotFoundException;

public class MotelRunner {

	public static void main(String[] args) {
		// Initialize the motel
		RoachMotel motel = null;
		try
		{
			motel = new RoachMotel("The only motel in town", 6, null); // TODO: Use Singleton pattern here
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found exception!");
		}

		// Roach colonies checking in/out
		RoachColony colony1 = new RoachColony("First colony", 100);
		System.out.println(motel.checkIn(colony1));
		System.out.println(motel);
		System.out.println();

		RoachColony colony2 = new RoachColony("Second colony", 100);
		System.out.println(motel.checkIn(colony2));
		System.out.println(motel);
		System.out.println();

		motel.checkOut(colony2);
		System.out.printf("Checking out: %s\n", colony2);
		System.out.println(motel);
		System.out.println();

		RoachColony colony3 = new RoachColony("Third colony", 100);
		System.out.println(motel.checkIn(colony3));
		System.out.println(motel);
		System.out.println();

		RoachColony colony4 = new RoachColony("Fourth colony", 100);
		System.out.println(motel.checkIn(colony4));
		System.out.println(motel);
		System.out.println();

		RoachColony colony5 = new RoachColony("Fifth colony", 100);
		System.out.println(motel.checkIn(colony5));
		System.out.println(motel);
		System.out.println();

		RoachColony colony6 = new RoachColony("Sixth colony", 100);
		System.out.println(motel.checkIn(colony6));
		System.out.println(motel);
		System.out.println();

		RoachColony colony7 = new RoachColony("Seventh colony", 100);
		System.out.println(motel.checkIn(colony7));
		System.out.println(motel);
		System.out.println();

		RoachColony colony8 = new RoachColony("Eighth colony", 100);
		System.out.println(motel.checkIn(colony8));
		System.out.println(motel);

		// Printing the log
		// TODO: implement reading and printing the logs
	}

}
