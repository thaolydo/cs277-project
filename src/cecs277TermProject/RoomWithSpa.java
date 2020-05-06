package cecs277TermProject;



public class RoomWithSpa  extends Room {
	Room currentRoom;
	
	
	public RoomWithSpa(Room currentRoom) {
		super(currentRoom.getRoomNumber(),currentRoom.getType());
		this.currentRoom = currentRoom;

	}
	
	@Override
	public double getCost() {
		return currentRoom.getCost() + 20;
	}
	
    @Override
    public String toString() {
        
		return currentRoom.toString() + ",Spa";
    }
}