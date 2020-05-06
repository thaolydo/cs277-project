package cecs277TermProject;



public class AmenitySpa  extends AmenitiesDecorator {
 
	public AmenitySpa(Room currentRoom, RoachMotelAmenities Amenity) {

		super(currentRoom,RoachMotelAmenities.SPA);

	}
	
	@Override
	public double getCost() {
		return super.getCost() + 20;
	}
	
    @Override
    public String toString() {
        return ",Spa";
    }
}