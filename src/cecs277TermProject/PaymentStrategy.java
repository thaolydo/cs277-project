package cecs277TermProject;

/**
 * The roaches have several payment methods available to them; they will all have their own implementation of pay();
 */
public interface PaymentStrategy 
{
	public String pay(double cost);
}
