package cecs277TermProject;

public class AmenitySprayResistantShower extends AmenitiesDecorator {
	 
	public AmenitySprayResistantShower(Room currentRoom, RoachMotelAmenities Amenity) {

		super(currentRoom,RoachMotelAmenities.SPRAYRESISTANTSHOWER);

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