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

	/**
	* Constructor which takes in a room.
	* @param currentRoom the room where the amenities are being offered.
	*/
	public RoomWithFoodBar(Room currentRoom) {
		super(currentRoom.getRoomNumber(), currentRoom.getType());
		this.currentRoom = currentRoom;
		this.sprayResistant = currentRoom.isSprayResistant();
	}

	/**
	* Calculates cost
	* @return  Gets the cost of this specific amenity and calls the 
	* parent class to also return its cost.
	*/
	@Override
	public double getCost() {
		return currentRoom.getCost() + 20;
	}

	@Override
	public String toString() {
		return currentRoom.toString() + ", FoodBar";
	}
}
