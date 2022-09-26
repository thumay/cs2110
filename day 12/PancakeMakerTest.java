import static org.junit.Assert.*;

import org.junit.Test;

public class PancakeMakerTest {

	//tests if method has required ingredients that person does not have
	@Test
	public void determineWholeFoodsOrderTest() 
	{
		//final private String[] requiredIngredients = { "flour","salt","soda","powder","buttermilk","egg" };
		PancakeMaker pancake = new PancakeMaker();
		String[] ingredientsIHave = {"flour", "salt"};
		assertEquals("ingredients needed incomplete/incorrect","soda, powder, buttermilk, egg", pancake.determineWholeFoodsOrder(ingredientsIHave));
		//logic error: prints out the required ingredients you do not have as many times as the length of the array IngredientsIHave
		//follow up logic error: prints out the ingredients you already have, but as many times as the length of the array IngredientsIHave minus 1
	}
	
	@Test
	public void determineWholeFoodsOrderTest2() 
	{
		//final private String[] requiredIngredients = { "flour","salt","soda","powder","buttermilk","egg" };
		PancakeMaker pancake = new PancakeMaker();
		String[] ingredientsIHave = {};
		assertEquals("ingredients needed incomplete/incorrect","flour, salt, soda, powder, buttermilk, egg" , pancake.determineWholeFoodsOrder(ingredientsIHave));
		//logic error: cannot pass thru foor loop because length of array is equal to 0, conditional is needed to check this error
	}
	
	@Test
	public void determineWholeFoodsOrderTest3() 
	{
		//final private String[] requiredIngredients = { "flour","salt","soda","powder","buttermilk","egg" };
		PancakeMaker pancake = new PancakeMaker();
		String[] ingredientsIHave = {"salt", "powder", "egg", "flour"};
		assertEquals("ingredients needed incomplete/incorrect","soda, buttermilk", pancake.determineWholeFoodsOrder(ingredientsIHave));
		//logic error: prints out the required ingredients you do not have as many times as the length of the array IngredientsIHave
		//follow up logic error: prints out the ingredients you already have, but as many times as the length of the array IngredientsIHave minus 1
	}


}
