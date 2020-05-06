package cecs277TermProject;

public class AmenityFoodBarAutoRefill  extends AmenitiesDecorator {
	 
	public AmenityFoodBarAutoRefill(Room currentRoom, RoachMotelAmenities Amenity) {

		super(currentRoom,RoachMotelAmenities.AUTOREFILL);

	}
	
	@Override
	public double getCost() {
		return super.getCost() + 5;
	}
	
    @Override
    public String toString() {
        return ",Foodbar AutoRefill";
    }
}