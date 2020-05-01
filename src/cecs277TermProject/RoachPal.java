package cecs277TermProject;

public class RoachPal implements PaymentStrategy
{
	/**
	 * Payment method by RoachPal card
	 * @return a message detailing payment method.
	 */
	@Override
	public String pay(double cost) 
	{
		return "Paid $" + cost + "by RoachPal"; 
	}

}
