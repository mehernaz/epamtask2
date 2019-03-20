package Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_calculator {
simple_calculator s=new simple_calculator();
	@Test
	public void testadd() {
		assertEquals(300,s.add(100,200));
		assertEquals(50,s.add(10,40));
	}
	@Test
	public void testmul() {
		assertEquals(200,s.mul(10,20));
		assertEquals(50,s.mul(10,5));
	}
	@Test
	public void testsub() {
		assertEquals(300,s.sub(500,200));
		assertEquals(50,s.sub(100,50));
	}
	@Test
	public void testdiv() {
		assertEquals(30,s.div(300,10));
		assertEquals(50,s.div(100,2));
	}

}
