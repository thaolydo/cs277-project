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
		return String.format("Paid $ %1$s by " + this.toString(), cost);
	}

	@Override
	public String toString()
	{
		return String.format("RoachPal - Email: %1$s.", email);
	}
}
