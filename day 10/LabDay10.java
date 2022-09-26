import java.util.HashSet;
/**
 * 
 * @author thumay
 *created 9/20/20
 * cohort 2
 * thumay huynh - tvh4xuk
 * martin salzberg - dms4ad
 * maraki fanuil - mtf8psz
 * anubhav acharya - aa9xu
 *
 */
public class LabDay10 
{

	public static void main(String[] args) 
	{
		LabDay10 example = new LabDay10();
		String[] listOfCards = {"champ", "buddy", "rufus"};	// list of names that exist
		String[] listOfTopNames = {"venus", "champ", "quincy", "buddy"}; // new names
        HashSet<String> setOfCards = new HashSet<String>();		//created set for existing names
        HashSet<String> setOfTopNames = new HashSet<String>();		//set for top names
        for(int i = 0; i < listOfCards.length; i++)
        {
        	setOfCards.add(listOfCards[i]);			//used loops to add the values in
        }
        for(int i = 0; i < listOfTopNames.length; i++)
        {
        	setOfTopNames.add(listOfTopNames[i]);
        }
        System.out.println(example.names(setOfCards, setOfTopNames));	//tested method
		
	}
	
	public HashSet<String> names(HashSet<String> cards, HashSet<String> topNames) 
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

  

}
