package cecs277TermProject;

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
		return "Paid $" + cost + "by MasterRoach card. Info: Name: " + name + " Number: " + cardNumber + " cvv: " + cvv + " Expiration Date: " + expirationDate + ".";
	}

}
