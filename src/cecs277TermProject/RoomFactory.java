package cecs277TermProject;

public class RoomFactory {
    public static Room createRoom(int roomNumber, RoomType roomType) {
        if (roomType == RoomType.BASIC) {
            return new BasicRoom(roomNumber, roomType);
        } else if (roomType == RoomType.KING) {
            return new KingRoom(roomNumber, roomType);
        } else if (roomType == RoomType.QUEEN) {
            return new QueenRoom(roomNumber, roomType);
        } else if (roomType == RoomType.SUITE) {
            return new SuiteRoom(roomNumber, roomType);
        } else
            return null;
    }
}