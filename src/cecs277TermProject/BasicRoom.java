/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;

/**
 * Basic Room class
 */
public class BasicRoom extends Room {
    private static final double BASE_RATE = 100;

    /**
     * Constructor
     * @param roomNumber roomNumber
     * @param type type
     */
    public BasicRoom(int roomNumber, RoomType type) {
        super(roomNumber, type);
    }

    @Override
    public double getCost() {
        return BASE_RATE;
    }
}