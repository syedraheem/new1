package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCalculator {

	@Test
	public void test() {
		Calculator test = new Calculator();
		assertNotNull(test);
	}
	@Test
	public void getTotal () {
		
	}
	@Test
	public void add (int value) {
		Calculator test = new Calculator();
		test.add(30);
		assertEquals(30,test.getTotal());
	}
	@Test
	public void subtract (int value) {
		Calculator test = new Calculator();
		test.subtract(20);
		assertEquals(-20,test.getTotal());
	}
	@Test
	public void multiply (int value) {
		Calculator test = new Calculator();
		test.add(5);
		test.multiply(10);
		assertEquals(50,test.getTotal());
	}
	@Test
	public void divide (int value) {
		Calculator test = new Calculator();
		test.add(5);
		test.divide(5);
		assertEquals(1,test.getTotal());
	}
	@Test
	public void getHistory () {
		fail("Not yet implemented");
	}
}
