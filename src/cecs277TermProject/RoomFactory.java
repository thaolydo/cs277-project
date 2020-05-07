/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;

/**
 * Factory class to create rooms.
 */
public class RoomFactory {

    /**
     * This method is to create room instances.
     *
     * @param roomNumber roomNumber
     * @param roomType   roomType
     * @return new room instances
     */
    public static Room createRoom(int roomNumber, RoomType roomType) {
        if (roomType == RoomType.BASIC) {
            return new BasicRoom(roomNumber, roomType);
        } else if (roomType == RoomType.KING) {
            return new KingRoom(roomNumber, roomType);
        } else if (roomType == RoomType.QUEEN) {
            return new QueenRoom(roomNumber, roomType);
        } else if (roomType == RoomType.SUITE) {
            return new SuiteRoom(roomNumber, roomType);
        } else {
            return null;
        }
    }
}