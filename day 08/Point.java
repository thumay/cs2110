
public class Point 
{
	//fields of class
	private double x; //x coordinate
	private double y; // y coordinate
	
	//constructor for Point class
	public Point() //default constructor
	{
		this.x = 0.0;
		this.y = 0.0;
	}
	
	//constructor #2 - illustrating
	//constructor overloading
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public static void main (String[] args)
	{
		//testing
		Point p; //point reference defined
		//doesn't create actual point
		Point p1 = new Point();
		Point p2 = new Point(3.0, 0.0);
		System.out.println(p1);
		System.out.println(p2);
		//testing distanceBetween method:
		double dis = p1.distanceBetween(p2);
		System.out.println("distance between p1 and p2:");
		System.out.println(dis);
	}
	
	//toString() method
	//print out instances of type Point
	public String toString()
	{
		return "(" +this.x + "," + this.y+ ")";
	}
	
	//calculate distance between 2 points
	public double distanceBetween(Point p)
	{
		double xdiff = this.x - p.x;
		double ydiff = this.y - p.y;
		
		return Math.sqrt(xdiff*xdiff + ydiff*ydiff);
	} //this refers to fields of the "calling" object

	public double getX() 
	{
		return x;
	}

	public void setX(double x) 
	{
		this.x = x;
	}

	public double getY()
	{
		return y;
	}

	public void setY(double y) 
	{
		this.y = y;
	}
	
	
}
