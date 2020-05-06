package cecs277TermProject;

public class RoachSpa  extends MotelAmenities {
	 MotelAmenities spa;
	 
	 public RoachSpa(MotelAmenities spa) {
		 this.spa = spa;
	 }
	 
	 @Override
	 public String getDescription() {
		 return ",Hotel Spa";
	 }
	 
	 @Override
	 public double getCost() {
		 return 20 ;
	 }
}
