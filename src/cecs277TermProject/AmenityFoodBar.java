package cecs277TermProject;

public class AmenityFoodBar  extends AmenitiesDecorator {
	 
	public AmenityFoodBar(Room currentRoom, RoachMotelAmenities Amenity) {
		super(currentRoom,RoachMotelAmenities.FOODBAR);

	}
	
	@Override
	public double getCost() {
		return super.getCost() + 25;
	}
	
    @Override
    public String toString() {
        return ",FoodBar";
    }
}