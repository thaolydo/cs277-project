package cecs277TermProject;

public class Room {
    protected int roomNumber;
    protected RoomType type;

    public Room(int roomNumber, RoomType type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%d", roomNumber);
    }

	public  double getCost() {
		return 0;
	}
    

    

}
