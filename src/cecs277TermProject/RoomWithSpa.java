/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;

/**
 * Room with spa amenity.
 */
public class RoomWithSpa extends Room {
	Room currentRoom;

	public RoomWithSpa(Room currentRoom) {
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
		return currentRoom.toString() + ", Spa";
	}
}
