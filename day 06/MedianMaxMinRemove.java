import java.util.ArrayList;

public class MedianMaxMinRemove 
{
	public static ArrayList<Integer> sortRemove(ArrayList<Integer> inputArrayList)
	{
		ArrayList<Integer> sorted = new ArrayList<Integer>(inputArrayList);
		sorted.sort(null);
		int indexMedian = sorted.size()/2;
		sorted.remove(indexMedian); //median removed
		sorted.remove(sorted.size()-1); //max removed
		sorted.remove(0);
		return sorted;
				
	}
	public static void main(String[] args)
	{
		ArrayList<Integer> numberArray = new ArrayList<Integer>();
		int numberCount = 10;
		for(int i = 0; i < numberCount; i++)
		{
			int randomNumber = (int)(Math.random()*100);
			numberArray.add(randomNumber);
		}	
		System.out.println(numberArray);
		ArrayList<Integer> sorted = sortRemove(numberArray);
		System.out.println(sorted);
	}
}
