public class ArrayExamples 
{

	public static void main(String[] args) 
	{
		// 1D arrays
		// declaration
		int[] intArray;
		String[] cityNames;
		
		//examples of references to an array
		
		//declare and instantiate an array
		int[] nums = new int[4];   //size=4
		
		//adding elements to array
		nums[0] = 87; // first position
		nums[1] = 77;
		nums[2] = 24;
		nums[3] = 100;
		// nums[4] = 50; >> ERROR - do not do this ! out of bounds
		
		// we can do math-like things
		nums[0] = 4 * nums[2] +1;
		System.out.println(nums[0]);
		
		int x = 1;
		nums[x] = 200; // nums[1] = 200
		System.out.println(nums[1]);
		
		//declare, instantiate, and load array
		double[] rate = new double[] {10.4, 2.3, 9.9, 5.5}; // size = 3
		double[] rates = {10.5, 3.3, 2.1};
		
		//loops and arrays
		for(int y = 0; y < 4; y++)
		{
			System.out.println("y = " + y + ":" + nums[y]);
		}
		
		//example: average of 100 doubles
		double[] numbers = new double[100];
		//load array with doubles
		for(int w = 0; w < numbers.length; w++)
		{
			numbers[w] = 10 * Math.random();	
		}
		
		//length
		System.out.println("array length is: "+ numbers.length);
		
		//sum
		double sum = 0.0;
		for(int n = 0; n <numbers.length; n++)
		{
			sum = sum + numbers[n]; //add all values
		}	
		
		//calculate the average
		System.out.println("the average is: " +sum / numbers.length);
		
		//for each loop example
		int[] myArray = new int[10];
		for(int val : myArray)
		{
			System.out.println(val);
			//do other stuff
		}
	}

}
