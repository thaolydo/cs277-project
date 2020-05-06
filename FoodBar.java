package cecs277TermProject;

package cecs277TermProject;

public class FoodBar  extends MotelAmenities {
	 MotelAmenities spa;
	 
	 public RoachSpa(MotelAmenities spa) {
		 this.spa = spa;
	 }
	 
	 public String getDescription() {
		 return getDescription() + ",Hotel Spa";
	 }
	 
	 public double cost() {
		 return 20 + super.cost();
	 }
}
