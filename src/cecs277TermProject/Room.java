package cecs277TermProject;

public class Room {
    private int roomNumber;
    private RoomType type;

    public Room(int roomNumber, RoomType type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%d", roomNumber);
    }
}
