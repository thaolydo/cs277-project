package cecs277TermProject;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * This is the Roach motel. It will use the Singleton design pattern. We will
 * set the capacity and name in the constructor.
 *
 * @author Tyler V
 *
 */
public class RoachMotel {
	private volatile static RoachMotel motel; // TODO: [Gust] Use this to implement Singleton pattern
	private Queue<Room> availableRooms; // This is a list of available rooms
	private Map<RoachColony, Room> occupiedRooms; // This is a map from customer -> room
	private String name;
	private int capacity; // This is a dummy variable because it's not used anywhere

	// TODO: [Gust] Make this constructor private and use it in Singleton pattern 
	
	public static RoachMotel getRoachMotel() {
		if (motel == null) {
			synchronized (RoachMotel.class) {
				if (motel == null) {
					motel = new RoachMotel("The only roach motel",6);
				}
			}
		}
		return motel;
	}
	private RoachMotel(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		this.occupiedRooms = new HashMap<>();

		// TODO: [Ly] Use factory pattern here to create rooms
		availableRooms = new LinkedList<>();
		availableRooms.add(new Room(101, RoomType.BASIC));
		availableRooms.add(new Room(102, RoomType.BASIC));
		availableRooms.add(new Room(103, RoomType.BASIC));
		availableRooms.add(new Room(104, RoomType.QUEEN));
		availableRooms.add(new Room(105, RoomType.SUITE));
		availableRooms.add(new Room(106, RoomType.KING));
	}


	//TODO: [Gust] Add a parameter for list of amenities
	
	public void checkIn(RoachColony roachColony) {
		// TODO: [Tyler] Implement logging this event here
		// TODO: [Ly] Implement checkIn validation
		System.out.printf("Checking in: %s\n", roachColony);
		Room room = availableRooms.poll();

		
		
		
		// TODO: [Gust] Implement decorator pattern here for amenities before associating the colony with the room
		occupiedRooms.put(roachColony, room);
	}

	public void checkOut(RoachColony roachColony) {
		// TODO: [Tyler] Implement logging this event here
		System.out.printf("Checking out: %s\n", roachColony);
		availableRooms.add(occupiedRooms.remove(roachColony));

		// TODO: [Tyler] Implement payment
	}

	@Override
	public String toString() {
		return String.format("Motel(name=%s, availableRooms=%s, occupiedRooms=%s)", name, availableRooms, occupiedRooms);
	}

}
