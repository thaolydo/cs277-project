/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;

/**
 * This is the base class for Motel room.
 */
public abstract class Room {
    private int roomNumber;
    private RoomType type;
    protected boolean sprayResistant;

    /**
     * Constructor
     * @param roomNumber roomNumber
     * @param type type
     */
    public Room(int roomNumber, RoomType type) {
        this.roomNumber = roomNumber;
        this.setType(type);
        this.sprayResistant = false;
    }

    public abstract double getCost();


    @Override
    public String toString() {
        return String.format("%d", roomNumber);
    }


	public int getRoomNumber() {
		return this.roomNumber;
	}


	public RoomType getType() {
		return this.type;
	}

	public void setType(RoomType type) {
		this.type = type;
    }
    
    public boolean isSprayResistant() {
        return sprayResistant;
    }

}
