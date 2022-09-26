
public class Circle 
{
	//fields
	private double radius;
	private Point center;	//classes can have fields
	
	//constructor 
	public Circle(double radius, Point center)
	{
		
	}
	
	//another constructor
	public Circle(Circle c) //copy constructor
	{
		this.radius = c.radius;
		this.center = c.center;

	}
	public static void main(String[] args) 
	{
		//testing
		Point centerPoint = new Point (1.0, 2.0);
		Circle c1 = new Circle(3.0, centerPoint);
		//radius = 3.0
		//center = centerPoint (point we just created)
		System.out.println("circle c1 is: " +c1);
		c1.setRadius(4.0);
		//input validation using setRadius method
		System.out.println(c1);
		c1.setRadius(-2);
		System.out.println(c1);
	}
	
	//toString() method to print out objects of type Cricle
	public String toString()
	{
		return "Center: " +this.center + " Radius: " +this.radius;
	}
	
	//getters & setters

	public double getRadius() 
	{
		return this.radius;
	}

	public void setRadius(double radius) 
	{
		if(radius > 0)
		{	
			this.radius = radius;
		}	
		//otherwise someone provided value out of range
		else 
		{
			this.radius = 1.0; //default value
		}
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	
	

}
