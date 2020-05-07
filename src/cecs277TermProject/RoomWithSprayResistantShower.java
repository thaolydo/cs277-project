/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;
public class RoomWithSprayResistantShower extends Room{
	Room currentRoom;
	public RoomWithSprayResistantShower(Room currentRoom) {
		super(currentRoom.getRoomNumber(),currentRoom.getType());
		this.currentRoom = currentRoom;
		this.sprayResistant = true;
	}
	
	@Override
	public double getCost() {
		return currentRoom.getCost() + 20;
	}
	
    @Override
    public String toString() {  
		return currentRoom.toString() + ", Spray Resistant Shower";
    }
}
