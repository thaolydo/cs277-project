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
	public RoachMotel(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		this.occupiedRooms = new HashMap<>();

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
		Room room = availableRooms.poll();

		// TODO: [Gust] Implement decorator pattern here for amenities before associating the colony with the room
		occupiedRooms.put(roachColony, room);

		result += "Successfully checking in";
		return result;
	}

	public void checkOut(RoachColony roachColony) {
		// TODO: [Tyler] Implement logging this event here
		availableRooms.add(occupiedRooms.remove(roachColony));

		// TODO: [Tyler] Implement payment
	}

	@Override
	public String toString() {
		return String.format("Motel(name=%s, availableRooms=%s, occupiedRooms=%s)", name, availableRooms, occupiedRooms);
	}

}
