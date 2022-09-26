import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DistinctWords 
{
	public static void main(String[] args)
	{
		String str[] = {"I", "Came", "I", "Saw", "I", "Conquered"};
		System.out.println("size of str (number of words): " +str.length);
		
		//create a hashset "s"
		Set<String> s = new HashSet <String>();
		//uncomment following line and comment above line to 
		//print word list in alpha order
		// create a treeSet "s"
		// Set <String> s = new TreeSet <String> ();
		
		// for every string in "str" try to add it to set "s"
		System.out.println("adding words in \"str\" to \"s\"...");
		for(int i = 0; i < str.length; i++)
		{
			s.add(str[i]);
		}
		System.out.println("size of hashSet set: " +s.size());
		System.out.println(s.size() + " distinct words: " +s);
	}
}
