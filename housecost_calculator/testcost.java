package housecost_calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcost {
cost c=new cost();
	@Test
	public void testestimate() {
		assertEquals(3000,c.estimate("abovestandard", 2),0.0);
		assertEquals(3600,c.estimate("standard", 3),0.0);
	}

}
