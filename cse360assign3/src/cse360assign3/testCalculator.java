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
	public void add () {
		Calculator test = new Calculator();
		test.add(30);
		assertEquals(30,test.getTotal());
	}
	@Test
	public void subtract () {
		Calculator test = new Calculator();
		test.subtract(20);
		assertEquals(-20,test.getTotal());
	}
	@Test
	public void multiply () {
		Calculator test = new Calculator();
		test.add(5);
		test.multiply(10);
		assertEquals(50,test.getTotal());
	}
	@Test
	public void divide () {
		Calculator test = new Calculator();
		test.add(5);
		test.divide(5);
		assertEquals(1,test.getTotal());
	}
	@Test
	public void getHistory () {
		Calculator test = new Calculator();
		test.add(5);
		assertEquals("0+5",test.getHistory());
	}
}
