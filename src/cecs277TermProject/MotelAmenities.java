package cecs277TermProject;
public abstract class MotelAmenities{
	boolean isActive;
//	A food bar – add $10 per night
//	A spa – add $20 per night
//	Auto refill of the food bar – add $5 per night
//	Spray resistant shower – add $25 per night.
//	The spray resistant shower comes in  
	 String description;
	 public abstract String getDescription();
	 public abstract double getCost();
	 
	 @Override
	 public String toString() {
		return getDescription();
	 }

}