
public class OnStar 
{
	public static void main(String[] args)
	{
		OnStar myOnStar = new OnStar();
		double[] speedHistory = {10, 11, 12};
		System.out.println(myOnStar.calculateAverageSpeed(speedHistory));
		System.out.println(myOnStar.calculateMileage(100.0, 10.0));
		System.out.println(myOnStar.calculateMileage(100.0, 0));

	}
	public double calculateMileage(double miles, double fuelConsumed)
	{
		if(fuelConsumed == 0) {return 0;}
		return miles/fuelConsumed;
	}
	
	public double calculateAverageSpeed(double[] speedHistory)
	{
		double sumOfSpeeds = 0;
		for(int i = 0; i <speedHistory.length; i++)
		{
			sumOfSpeeds = sumOfSpeeds +speedHistory[i];
		}
		return sumOfSpeeds/speedHistory.length;
	}
}
