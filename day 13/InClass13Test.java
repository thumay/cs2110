import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InClass13Test {

	@Test
	public void powerTest1() {
		InClass13 test = new InClass13();
	    double testBase = 2;
		int testExponent = 3;
		assertEquals("base or exponent printed is incorrect", 8.0, test.power(testBase, testExponent),.01);
	}
	
	@Test
	public void powerTest2() {
		InClass13 test = new InClass13();
	    double testBase = 2;
		int testExponent = -3;
		assertEquals("base or exponent printed is incorrect",1.0/8.0, test.power(testBase, testExponent),.01);
	}
	
	@Test
	public void powerTest3() {
		InClass13 test = new InClass13();
	    double testBase = 0;
		int testExponent = -3;
		assertEquals("base or exponent printed is incorrect",Double.NaN, test.power(testBase, testExponent),.01);
	}
}
