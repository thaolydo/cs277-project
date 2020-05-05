package cecs277TermProject;

public class QueenRoom extends Room {
    private static final double BASE_RATE = 125;

    public QueenRoom(int roomNumber, RoomType type) {
        super(roomNumber, type);
        this.baseRate = BASE_RATE;
    }

    @Override
    public double getCost() {
        return baseRate;
    }
}