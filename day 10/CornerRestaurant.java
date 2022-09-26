import java.util.HashSet;

/**
 * 
 * 9/21/20
 * @author thumay
 * creating a demonstration class to put into a set container
 */
public class CornerRestaurant 
{
	private String name;
	private int rating;
	private String cost;
	
	public CornerRestaurant()
	{
		
	}
	
	public CornerRestaurant (String name, int rating, String cost)
	{
		this.name = name;
		this.rating = rating;
		this.cost = cost;
	}
	/**
	 * 
	 * use main method for testing
	 * @param args
	 */
	public static void main(String[] args)
	{
		CornerRestaurant cr1 = new CornerRestaurant("little johns", 5, "$");
		CornerRestaurant cr2 = new CornerRestaurant("christian's pizza", 4, "$");
		CornerRestaurant cr3 = new CornerRestaurant("revolutionary soup", 5, "$$");
		
		HashSet <CornerRestaurant> corner = new HashSet <CornerRestaurant>();
		
		corner.add(cr1);
		corner.add(cr2);
		corner.add(cr3);
		
		System.out.println(corner.size() + " items in this container");
		for(CornerRestaurant cr : corner)
		{
			System.out.println(cr.getName());
		}	

		corner.remove(cr1);
		System.out.println(corner.size() + " items in this container");
		System.out.println(cr1);

	}
	public String toString()
	{
		return this.name + " rated as " + this.rating + "costing " + this.cost;
	}
	public boolean equals(Object o)
	{
		if(o == null)
		{
			return false;
		}	
		//if(o.getClass() != this.getClass())
		if(! (o instanceof CornerRestaurant))
		{
			return false;
		}
		CornerRestaurant otherObject = (CornerRestaurant) o;
		if(otherObject.cost.equals(this.cost) && otherObject.name.equals(this.name)&& otherObject.rating == this.rating)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
/**
 * 
 * @return the name
 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}
	
}
