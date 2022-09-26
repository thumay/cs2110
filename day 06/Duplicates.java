import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//cohort 2
//thumay huynh - tvh4xuk
//martin salzberg - dms4ad
//maraki fanuil - mtf8psz
//anubhav acharya - aa9xu
public class Duplicates 
{

	public static void main(String[] args) 
	{
		ArrayList<String> inputList = new ArrayList<String>();
		
		
		Scanner key = new Scanner(System.in);
		System.out.println("How many Strings would you like to enter?");
		int num = key.nextInt();
		key.nextLine();

		
		String str;
		for(int i = 0; i < num; i++) 
		{
			System.out.println("What String would you like to add?");
			str = key.nextLine();
			inputList.add(str);		
		}
		
		
		System.out.println(inputList);
		System.out.println(removeDups(inputList));
		//comment out above and uncomment below if you want to try the array bonus
		//System.out.println(Arrays.toString(inputList));
		//System.out.println(Arrays.toString(removeDups(inputList)));
		
	}
	
	public static ArrayList<String> removeDups(ArrayList<String> al) 
	{
		ArrayList<String> newArrayList = al;
		
		for(int i = 0; i < al.size(); i++)
		{
			for(int j = 0; j < al.size(); j++)
			{
				if(i != j)
				{
					if(al.get(i).equals(al.get(j)))
					{
						newArrayList.remove(j);
					}	
				}	
			}	
		}	
		return newArrayList;
			
	}
	
}
