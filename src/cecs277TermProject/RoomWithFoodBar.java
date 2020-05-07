/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;

/**
 * Room with food bar amenity.
 */
public class RoomWithFoodBar extends Room {
	Room currentRoom;

	public RoomWithFoodBar(Room currentRoom) {
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
		return currentRoom.toString() + ", FoodBar";
	}
}
