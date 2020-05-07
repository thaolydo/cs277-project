/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;

import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The runner class for this project.
 */
public class MotelRunner {

	public static void main(String[] args) {
		try {
			// Initialize the motel
			RoachMotel motel = RoachMotel.getRoachMotel();

			// Roach colonies checking in/out
			RoachColony colony1 = new RoachColony("First colony", 100);
			System.out.println(motel.checkIn(colony1, Arrays.asList(AmenityType.AUTO_REFILL, AmenityType.SPA)));
			System.out.println(motel);
			System.out.println();

			RoachColony colony2 = new RoachColony("Second colony", 100);
			System.out.println(motel.checkIn(colony2, Arrays.asList(AmenityType.AUTO_REFILL, AmenityType.FOODBAR)));
			System.out.println(motel);
			System.out.println();

			System.out.printf("Checking out %s\n", colony2);
			motel.checkOut(colony2, new RoachPal("Colony2@rmail.com", "aGoodPassword"), 1);
			System.out.println(motel);
			System.out.println();

			RoachColony colony3 = new RoachColony("Third colony", 100);
			System.out.println(
					motel.checkIn(colony3, Arrays.asList(AmenityType.SPRAY_RESISTANT_SHOWER, AmenityType.AUTO_REFILL)));
			System.out.println(motel);
			System.out.println();

			RoachColony colony4 = new RoachColony("Fourth colony", 100);
			System.out.println(motel.checkIn(colony4, Arrays.asList()));
			System.out.println(motel);
			System.out.println();

			RoachColony colony5 = new RoachColony("Fifth colony", 100);
			System.out.println(motel.checkIn(colony5, Arrays.asList()));
			System.out.println(motel);
			System.out.println();

			RoachColony colony6 = new RoachColony("Sixth colony", 100);
			System.out.println(motel.checkIn(colony6, Arrays.asList()));
			System.out.println(motel);
			System.out.println();

			RoachColony colony7 = new RoachColony("Seventh colony", 100);
			System.out.println(
					motel.checkIn(colony7, Arrays.asList(AmenityType.SPRAY_RESISTANT_SHOWER, AmenityType.SPA)));
			System.out.println(motel);
			System.out.println();

			// Simulate partying
			System.out.printf("%s is partying\n", colony3);
			colony3.party();
			System.out.printf("%s population after partying is %d\n", colony3, colony3.getPopulation());
			System.out.printf("%s is partying\n", colony6);
			colony6.party();
			System.out.printf("%s population after partying is %d\n", colony6, colony6.getPopulation());

			motel.checkOut(colony3, new RoachPal("Colony3@rmail.com", "aGoodPassword"), 2);
			System.out.println(motel);
			System.out.println();

			RoachColony colony8 = new RoachColony("Eighth colony", 100);
			System.out.println(
					motel.checkIn(colony8, Arrays.asList(AmenityType.SPRAY_RESISTANT_SHOWER, AmenityType.FOODBAR)));
			System.out.println(motel);

			// Printing the log
			printLog();

		} // End of try block//
		catch (FileNotFoundException e) {
			System.out.println("File not found exception!");
		}
	}

	/**
	 * This method is to read and print out the logs.
	 *
	 * @throws FileNotFoundException
	 */
	private static void printLog() throws FileNotFoundException {
		System.out.println();
		System.out.println("Printing out the log file.");
		Logger log = Logger.getLogger();
		log.closeLogger();
		Scanner scanner = new Scanner(log.getFile());
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}

}
