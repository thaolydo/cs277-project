/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;

/**
 * The roaches have several payment methods available to them; they will all have their own implementation of pay();
 */
public interface PaymentStrategy 
{
	public String pay(double cost);
}
