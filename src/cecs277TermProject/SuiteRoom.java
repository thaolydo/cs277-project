/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;

/**
 * Suite room class
 */
public class SuiteRoom extends Room {
    private static final double BASE_RATE = 200;

    /**
     * Constructor
     *
     * @param roomNumber roomNumber
     * @param type       type
     */
    public SuiteRoom(int roomNumber, RoomType type) {
        super(roomNumber, type);
    }

    @Override
    public double getCost() {
        return BASE_RATE;
    }
}