/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;

/**
 * Room with auto refill amenity.
 */
public class RoomWithAutoRefill extends Room {
	Room currentRoom;

	/**
	 * Constructor.
	 *
	 * @param currentRoom the room to be decorated.
	 */
	public RoomWithAutoRefill(Room currentRoom) {
		super(currentRoom.getRoomNumber(), currentRoom.getType());
		this.currentRoom = currentRoom;
		this.sprayResistant = currentRoom.isSprayResistant();
	}

	@Override
	public double getCost() {
		return currentRoom.getCost() + 20;
	}

	@Override
	public String toString() {
		return currentRoom.toString() + ", AutoRefill";
	}
}
