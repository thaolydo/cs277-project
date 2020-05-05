package cecs277TermProject;

public class BasicRoom extends Room {
    private static final double BASE_RATE = 100;

    public BasicRoom(int roomNumber, RoomType type) {
        super(roomNumber, type);
        this.baseRate = BASE_RATE;
    }

    @Override
    public double getCost() {
        return baseRate;
    }
}