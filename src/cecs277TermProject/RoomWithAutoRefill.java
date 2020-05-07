package cecs277TermProject;

public class RoomWithAutoRefill  extends Room {
	 Room currentRoom;
	 public RoomWithAutoRefill(Room currentRoom){
		 super(currentRoom.getRoomNumber(),currentRoom.getType());
		this.currentRoom = currentRoom;

	}
	
	@Override
	public double getCost() {
		return currentRoom.getCost() + 20;
	}
	
 @Override
 public String toString() {
     
		return currentRoom.toString() + ", Food Bar AutoRefill";
 }
}
