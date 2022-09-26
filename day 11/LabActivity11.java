import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author thumay
 * cohort - 2
 * thumay huynh - tvh4xuk
 * martin salzberg - dms4ad
 * maraki fanuil - mtf8psz
 * anubhav acharya - aa9xu
 * 
* Lab Activity 11 - Sets
* Practice writing methods that involve Sets and Maps
* Using specific implementation classes: HashSet and TreeMap
* Don't forget to comment the code that you write. Also, test your code in the main method
*/
public class LabActivity11 {

    /**
    * This method (names) takes in two sets: one of names already on cards
    * and the other containing the top 100 names. The method returns
    * a set of names for the new cards needed (in topNames but not in cards) 
    */
    public static HashSet<String> names(HashSet<String> cards, HashSet<String> topNames)
    {
    	HashSet<String> newCardSet = new HashSet<String>();
        
        for(String ele : topNames) //for each topNames value is assigned to ele
        {
        	if(!cards.contains(ele))	//if the cards Set does not contain the ele (topNames value)
        	{
        		newCardSet.add(ele);	//add the ele to the newCardSet
        	}
        }
        return newCardSet;  //return the newCardSet with names that still need cards   
     }
    
    /**
    * This method (reverseBook) takes a TreeMap representation of a phonebook
    * (Key=Name, a String, and Value=Number, an Integer).
    * The method returns the reverse phonebook (that is, you know the number
    * and you're looking for the name)
    */  
    public static TreeMap<Integer, String> reverseBook(TreeMap<String, Integer> phoneBook)
    {
    	TreeMap<Integer, String> phoneBookReversed = new TreeMap<Integer, String>(); //create tree map of reversed phone book
    	for(String keyValue : phoneBook.keySet())	//for each keyVlaue in phoneBook
    	{	
    		phoneBookReversed.put(phoneBook.get(keyValue), keyValue);	//put the key value where Integer is, and string value in the slot of the key value 
    	}
    	
    	return phoneBookReversed;		//return new reversed phone book
    }
    
    
    public static void main(String[] args) 
    {
    	//testing for dog names
    	LabActivity11 example = new LabActivity11();
		String[] listOfCards = {"champ", "buddy", "rufus"};		// list of names that exist
		String[] listOfTopNames = {"venus", "champ", "quincy", "buddy"};	// new names
        HashSet<String> setOfCards = new HashSet<String>();		//created set for existing names
        HashSet<String> setOfTopNames = new HashSet<String>();		//set for top names
        for(int i = 0; i < listOfCards.length; i++)
        {
        	setOfCards.add(listOfCards[i]);		//add elements of listOfCards to hash set
        }
        for(int i = 0; i < listOfTopNames.length; i++)
        {
        	setOfTopNames.add(listOfTopNames[i]);	//add elements of listOfTopNames to hash set
        }
        System.out.println(example.names(setOfCards, setOfTopNames));
        
        //testing for phonebook
        TreeMap<String, Integer> phoneBookTest = new TreeMap<String, Integer>(); //map created for method parameter
        phoneBookTest.put("thumay", 123123123);
        phoneBookTest.put("maraki", 987987987);		//add key value pairs to map
        phoneBookTest.put("martin", 567567567);
        
        System.out.println(reverseBook(phoneBookTest)); // test printed
		
		
    }

}