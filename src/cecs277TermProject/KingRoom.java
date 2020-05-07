/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;

/**
 * King Room class
 */
public class KingRoom extends Room {
    private static final double BASE_RATE = 100;

    /**
     * Constructor
     *
     * @param roomNumber roomNumber
     * @param type       type
     */
    public KingRoom(int roomNumber, RoomType type) {
        super(roomNumber, type);
    }

    @Override
    public double getCost() {
        return BASE_RATE;
    }
}