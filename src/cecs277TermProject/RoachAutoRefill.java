package cecs277TermProject;

public class RoachAutoRefill  extends MotelAmenities {

	MotelAmenities autoRefill;
	 
	public RoachAutoRefill(MotelAmenities autoRefill) {
		this.autoRefill = autoRefill;
		}
	 @Override
	 public String getDescription() {
		return ",Auto Refill";
	 }
	 @Override
	 public double getCost() {
		 return 20 ;
	 }

}
