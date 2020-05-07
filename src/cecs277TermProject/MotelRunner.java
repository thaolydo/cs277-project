package cecs277TermProject;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MotelRunner {

	public static void main(String[] args) {
		try
		{
			// Initialize the motel
			RoachMotel motel = RoachMotel.getRoachMotel();  // TODO: Use Singleton pattern here UPDATE DONE

			// Roach colonies checking in/out
			RoachColony colony1 = new RoachColony("First colony", 100);
			System.out.println(motel.checkIn(colony1));
			System.out.println(motel);
			System.out.println();

			RoachColony colony2 = new RoachColony("Second colony", 100);
			System.out.println(motel.checkIn(colony2));
			System.out.println(motel);
			System.out.println();

			motel.checkOut(colony2, new RoachPal("Colony2@rmail.com", "aGoodPassword"), 1);
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
			Logger log = Logger.getLogger();
			log.closeLogger();
			Scanner scanner = new Scanner(log.getFile());
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}//End of try block//
		catch(FileNotFoundException e)
		{
			System.out.println("File not found exception!");
		}
	}

}
