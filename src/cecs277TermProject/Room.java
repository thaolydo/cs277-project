package cecs277TermProject;

public abstract class Room {
    private int roomNumber;
    private RoomType type;
    private double baseRate;

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

	public double getBaseRate() {
		return this.baseRate;
	}

	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
}
