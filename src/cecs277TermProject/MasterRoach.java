package cecs277TermProject;

/**
 * MasterRoach is meant to be a credit card just for roaches.  It is one of two payment methods the motel accepts.
 */
public class MasterRoach implements PaymentStrategy
{

	private String name; 
	private String cardNumber;
	private String cvv;
	private String expirationDate;
	
	public MasterRoach(String name, String cardNumber, String cvv, String expirationDate)
	{
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expirationDate = expirationDate;
	}
	
	/**
	 * Payment method by MasterRoach card
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
		return  String.format("MasterRoach card - Info: Name: %1$s Number: %2$s cvv: %3$s Expiration Date: %4$s.", name, cardNumber, cvv, expirationDate);
	}

}
