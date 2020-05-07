/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;


/**
 * RoachPal is a fancy new way for roaches to pay for all manner of things using the internet.  It is one of two payment methods the motel accepts.
 */
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
