package cecs277TermProject;

public abstract class Room {
    protected int roomNumber;
    protected RoomType type;
    protected double baseRate;

    public Room(int roomNumber, RoomType type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }


    public abstract double getCost();

    @Override
    public String toString() {
        return String.format("%d", roomNumber);
    }
}
