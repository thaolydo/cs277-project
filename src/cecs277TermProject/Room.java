package cecs277TermProject;

public abstract class Room {
    private int roomNumber;
    private RoomType type;

    public Room(int roomNumber, RoomType type) {
        this.roomNumber = roomNumber;
        this.setType(type);
    }


    public abstract double getCost();


    @Override
    public String toString() {
        return String.format("%d", roomNumber);
    }


	public int getRoomNumber() {
		return this.roomNumber;
	}


	public RoomType getType() {
		return this.type;
	}

	public void setType(RoomType type) {
		this.type = type;
	}

}
