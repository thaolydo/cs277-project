package cecs277TermProject;

public class RoachSprayResistantShower extends MotelAmenities {

	MotelAmenities autoRefill;
	 
	public RoachSprayResistantShower(MotelAmenities autoRefill) {
		this.autoRefill = autoRefill;
		}
	 @Override
	 public String getDescription() {
		return ",Auto Refill";
	 }
	 @Override
	 public double getCost() {
		 return 25 ;
	 }

}


