/** @author thumay
 * thumay huynh - tvh4xuk
 * martin salzberg - dms4ad
 * maraki fanuil - mtf8psz
 * anubhav acharya - aa9xu
 */
public class Circle {

	//fields
	private Point p;
	private double radius;
	
	//constructors
	//default constructors
	public Circle(Point c, double rad){
		p = c;
		radius = rad;
	}
	
	//constructors
	public Circle(){
		p = new Point(0,0);
		radius = 1;
	}
	
	//main method
	public static void main(String[] args) {
	
		Point p = new Point(1,1);
		Circle c = new Circle(p, 3);
		System.out.println(c);
		
		String s = "3.1415";
		double pi = Double.parseDouble(s);
		System.out.println(pi * 5);
		
		//new objects to help with testing
		Point o = new Point (4,2);
		Circle i = c;
		Circle r = new Circle (p, 3);
		Circle l = new Circle(o, 2);
		
		System.out.println("compare 2 references to the same circle: " +c.equals(i));
		System.out.println("compare 2 circles that have the same values (different objects): " + c.equals(r));
		System.out.println("compare 2 circles that have different values: " + r.equals(l));
		
	}
	
	//other methods
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString(){
		return "<" + p + ", " + "radius: " + radius +">";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

}