
package cse360assign3;

public class Calculator {

	private int total;
	private String raheem;
	public Calculator () {
		total = 0;  // not needed - included for clarity
		raheem = "0";
	}
	
	public int getTotal () {
		return total;
	}
	/**
	 * @param-value
	 * int adds
	 */
	public void add (int value) {
		total += value;
		raheem += "+" + value;
	}
	/**
	 * @param-value
	 * int subtracts
	 */
	public void subtract (int value) {
		total -= value;
		raheem += "-" + value;
	}
	/**
	 * @param-value
	 * int multiplys
	 */
	public void multiply (int value) {
		total *= value;
		raheem += "*" + value;
	}
	/**
	 * @param-value
	 * int divides
	 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total /= value;
		raheem += "/" + value;
	}
	/**
	 * @param-value
	 * int gets history
	 */
	public String getHistory () {
		
		return raheem;
	}
}