package cecs277TermProject;

public class RoachPal implements PaymentStrategy
{
	private String email;
	private String password;
	
	public RoachPal(String email, String password)
	{
		this.email = email;
		this.password = password;
	}
	
	
	
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
