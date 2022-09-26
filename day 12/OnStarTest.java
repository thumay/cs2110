import static org.junit.Assert.*;

import org.junit.Test;

public class OnStarTest {

	@Test
	public void calculateMileageTest() {
		OnStar myOnStar = new OnStar();
		assertEquals("error calculating mileage with 100 miles and 10 gallons",10.0,myOnStar.calculateMileage(100, 10), .01);
	}
	
	@Test
	public void calculateAverageSpeedTest() 
	{
		OnStar myOnStar = new OnStar();
		double[] speedHistory = {10., 11, 12.};
		assertEquals("error caculating average speed.", 11, myOnStar.calculateAverageSpeed(speedHistory),0.01);
	}
	

}
