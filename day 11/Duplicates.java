import java.util.HashSet;
import java.util.Set;

public class Duplicates 
{
	public static void main(String[] args)
	{
		String str[] = {"I", "Came", "I", "Saw", "I", "Conquered"};
		System.out.println("size of str (number of words): " +str.length);
		
		//create 2 sets (hashset)
		Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();
		
		//for every string in "str" try to add it to the set "uniques"
		for(int i = 0; i < str.length; i++)
		{
			if(uniques.add(str[i]))	//if cannot add that word to uniques
			{							// means it already exists there	
				dups.add(str[i]);		// add to dups Set
			}
		}	
		
		//destructive set-difference
		//remove words from uniques that show up in dups
		uniques.removeAll(dups);
		//----using.size();
		System.out.println("size of hashset dups: " +dups.size());
		//using .constains();
		System.out.println("does the word 'saw' exist?" +dups.contains("Saw"));
		System.out.println("unique words: " +uniques); //notice order of output
		System.out.println("duplicate words: " +dups);
		
		//looping thru uniques set (and in this example, printing it out)
		for(String ele : uniques)
		{
			System.out.println(ele);
		}
	}
}
