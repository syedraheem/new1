
package cse360assign3;

public class Calculator {

	private int total;

	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return 0;
	}
	/**
	 * @param-value
	 * int adds
	 */
	public void add (int value) {
		total += value;
	}
	/**
	 * @param-value
	 * int subtracts
	 */
	public void subtract (int value) {
		total -= value;
	}
	/**
	 * @param-value
	 * int multiplys
	 */
	public void multiply (int value) {
		total *= value;
	}
	/**
	 * @param-value
	 * int divides
	 */
	public void divide (int value) {
		total /= value;
	}
	/**
	 * @param-value
	 * int gets history
	 */
	public String getHistory () {
		return "";
	}
}