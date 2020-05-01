package cecs277TermProject;

public class MasterRoach implements PaymentStrategy{

	/**
	 * Payment method by MasterRoach card
	 * @return a message detailing payment method.
	 */
	@Override
	public String pay(double cost) 
	{
		return "Paid $" + cost + "by MasterRoach card";
	}

}
