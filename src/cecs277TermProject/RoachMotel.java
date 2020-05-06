package cecs277TermProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * This is the Roach motel. It will use the Singleton design pattern. We will
 * set the capacity and name in the constructor.
 *
 */
public class RoachMotel {
	private volatile static RoachMotel motel; // TODO: [Gust] Use this to implement Singleton pattern
	private Queue<Room> availableRooms; // This is a list of available rooms
	private Map<RoachColony, Room> occupiedRooms; // This is a map from customer -> room
	private String name;
	private int capacity; // This is a dummy variable because it's not used anywhere
	private Logger logger;
	

	// TODO: [Gust] Make this constructor private and use it in Singleton pattern
	public RoachMotel(String name, int capacity) throws FileNotFoundException {
		this.name = name;
		this.capacity = capacity;
		this.occupiedRooms = new HashMap<>();
		this.logger = logger.getLogger();

		// Create Rooms and add them to motel
		availableRooms = new LinkedList<>();
		availableRooms.add(RoomFactory.createRoom(101, RoomType.BASIC));
		availableRooms.add(RoomFactory.createRoom(102, RoomType.BASIC));
		availableRooms.add(RoomFactory.createRoom(103, RoomType.BASIC));
		availableRooms.add(RoomFactory.createRoom(104, RoomType.QUEEN));
		availableRooms.add(RoomFactory.createRoom(105, RoomType.SUITE));
		availableRooms.add(RoomFactory.createRoom(106, RoomType.KING));
	}

	// TODO: [Gust] Add a parameter for list of amenities
	public String checkIn(RoachColony roachColony) {
		// TODO: [Tyler] Implement logging this event here
		String result = String.format("Checking in: %s\n", roachColony);
		if (availableRooms.isEmpty()) {
			return result + "No available room.";
		}
		logCheckIn(roachColony, this.logger);
		// Logging should be mostly finished; just need room methods to be finished - Tyler
		// TODO: [Ly] Implement checkIn validation
		System.out.printf("Checking in: %s\n", roachColony);
		Room room = availableRooms.poll();

		// TODO: [Gust] Implement decorator pattern here for amenities before associating the colony with the room
		occupiedRooms.put(roachColony, room);

		result += "Successfully checking in";
		return result;
	}

	public void checkOut(RoachColony roachColony, PaymentStrategy paymentMethod, int numDays) {
		// TODO: [Tyler] Implement logging this event here
		this.logCheckOut(paymentMethod, roachColony, numDays, this.logger);
		// Logging should be mostly finished; just need room methods to be finished - Tyler
		System.out.printf("Checking out: %s\n", roachColony);
		availableRooms.add(occupiedRooms.remove(roachColony));
		this.pay(paymentMethod, roachColony, numDays);
		
	}
	
	/**
	 * Will allow a colony to pay for the room upon checkout.  A payment method (RoachPal or MasterRoach) will be passed in through the main method.
	 * @param paymentMethod  A payment method (RoachPal or MasterRoach) passed in through the main method.
	 * @param cost The total cost to be paid.
	 */
	private String pay(PaymentStrategy paymentMethod, RoachColony colony, int numDays)
	{
		Room paidRoom = occupiedRooms.get(colony);
		// in progress, needs a way to calculate cost from amenities - tyler
		double cost = paidRoom.getCost() * numDays;
		//logCheckOut(paymentMethod, colony, numDays, this.logger);
		return paymentMethod.pay(cost);
	}
	
	private void logCheckIn(RoachColony colony, Logger log)
	{
		Room loggedRoom = occupiedRooms.get(colony);
		
		log.log(String.format("Successfully Checked In: Colony %1$s checking into %2$s", colony, loggedRoom));
	}
	
	private void logCheckOut(PaymentStrategy paymentMethod, RoachColony colony, int numDays, Logger log)
	{
		Room loggedRoom = occupiedRooms.get(colony);
		
		log.log(String.format("Successfully Checked In: Colony %1$s checking into %2$s cost: %3$s using %4$s", 
					colony, loggedRoom, (loggedRoom.getCost() * numDays), paymentMethod));
	
	}

	@Override
	public String toString() {
		return String.format("Motel(name=%s, availableRooms=%s, occupiedRooms=%s)", name, availableRooms, occupiedRooms);
	}

}
