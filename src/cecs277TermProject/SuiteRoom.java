package cecs277TermProject;

public class SuiteRoom extends Room {
    private static final double BASE_RATE = 200;

    public SuiteRoom(int roomNumber, RoomType type) {
        super(roomNumber, type);
    }

    @Override
    public double getCost() {
        return BASE_RATE;
    }
}