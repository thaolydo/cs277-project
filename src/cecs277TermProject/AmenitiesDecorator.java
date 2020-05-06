package cecs277TermProject;

public abstract class AmenitiesDecorator  extends Room {
	public AmenitiesDecorator(Room currentRoom, RoachMotelAmenities Amenity) {
		super(currentRoom.roomNumber, currentRoom.type);
	}
	
    @Override
    public abstract String toString();
    
    
    @Override
    public double getCost() {
       return super.getCost();
    }
}