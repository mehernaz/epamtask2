package SimpleInterest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInterest {
Interest i=new Interest();
	@Test
	public void simpleinterest_test() {
		assertEquals(200,i.simpleinterest(5000, 2, 2),0.0);
		assertEquals(1,i.simpleinterest(100, 1, 1),0.0);
		
	}
	@Test
	public void compoundinterest_test() {
		assertEquals(288.00,i.compoundinterest(200, 20, 2),0.0);
		
		
	}
	
	
}
