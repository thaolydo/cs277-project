/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;

/**
 * Queen room class
 */
public class QueenRoom extends Room {
    private static final double BASE_RATE = 125;

    /**
     * Constructor
     *
     * @param roomNumber roomNumber
     * @param type       type
     */
    public QueenRoom(int roomNumber, RoomType type) {
        super(roomNumber, type);
    }

    @Override
    public double getCost() {
        return BASE_RATE;
    }
}