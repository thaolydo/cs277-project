package cecs277TermProject;

public class RoachFoodBar  extends MotelAmenities {

	MotelAmenities foodBar;
	 
	public RoachFoodBar(MotelAmenities foodBar) {
		this.foodBar = foodBar;
		}
	 @Override
	 public String getDescription() {
		 return ",Food Bar";
	 }
	 @Override
	 public double getCost() {
		 return 20 ;
	 }

}
