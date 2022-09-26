
public class ControlStructures 
{
	public static void main(String[] args)
	{
		//grading application
		
		int grade = 92;
		if (grade > 90)
		{
			System.out.println("your grade is: A");
		}	
		else if(grade > 80)
		{
			System.out.println("your grade is B");
		}
		else if(grade>70)
		{
			System.out.println("your grade is c");
		}	
		else
		{	
			System.out.println("grade lower than c");
		}
		
		//loops
		//while loop
		int i = 0;
		while (i<=5)
		{
			System.out.println("the value is: " +i);
			i++; //i = i+1;
		}	
		
		//for loops - often known the number of iterations
		for(int q = 0; q < 15; q = q+2)
		{
			//body
			System.out.println(q);
		}	
		
		// for each loop
		String[] foodItems = {"Steak", "Strawberries", "Cheese"};
		
		//foodItems is array of Strings - iterate through
		
		for(String food: foodItems)
		{
			System.out.println("i like to eat: " + food);
		}	
		
	}
	
}
