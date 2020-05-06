package cecs277TermProject;

public class RoomWithFoodBar  extends Room {
	Room currentRoom;
	public RoomWithFoodBar(Room currentRoom) {
		super(currentRoom.getRoomNumber(),currentRoom.getType());
		this.currentRoom = currentRoom;

	}
	
	@Override
	public double getCost() {
		return currentRoom.getCost() + 20;
	}
	
    @Override
    public String toString() {
        
		return currentRoom.toString() + ",FoodBar";
    }
}