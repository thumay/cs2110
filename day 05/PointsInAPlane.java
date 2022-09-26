
public class PointsInAPlane 
{

	public static void main(String[] args) 
	{
		// you'll put your tests here
		double test = points (10,-2);
		System.out.println(test);

	}
	public static double points(double x, double y)
	{
		if(x >= 0 && y >=0)
		{
			return x * y;
		}	
		else if(x < 0 && y >=0)
		{
			return x - y;
		}
		else if(x < 0 && y <0)
		{
			return x / y;
		}
		else
		{
			return x + y;
		}
	}

}
