/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;

/**
 * Room with auto refill amenity.
 */
public class RoomWithAutoRefill extends Room {
	/**The room that containts this amenity*/
	Room currentRoom;

	/**
	* Constructor which takes in a room.
	* @param currentRoom the room where the amenities are being offered.
	*/
	public RoomWithAutoRefill(Room currentRoom) {
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
	
	/**
	* toString() allows us to print the object as well as details of the
	* currentRoom.
	*
	* @return details of the amenity as well as details of the room
	*/
	@Override
	public String toString() {
		return currentRoom.toString() + ", AutoRefill";
	}
}
