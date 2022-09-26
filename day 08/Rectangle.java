/**
 * 
 * created 9/19/20
 * @author thumay
 * thumay huynh - tvh4xuk
 * martin salzberg - dms4ad
 * maraki fanuil - mtf8psz
 * anubhav acharya - aa9xu
 *
 */
public class Rectangle 
{
	
	// fields
	private double length;
	private double width;
	
	// default constructor (takes no parameters)
	public Rectangle() {
		// length and width assigned default values (4 for length and 2 for width)
		this.length = 4;
		this.width = 2;
	}
	
	// constructor 
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	// WRITE an appropriate 
	//     (1) toString method
	//     (2) getter and setter methods for the length field
	//     (3) getter and setter methods for the width field 
	
	//toString method
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	//getters and setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public static void main(String[] args) {
		// Reminder: don't write methods within other methods.
		// Test out toString() method and getters and setters here! (Main method testing) 
		Rectangle r = new Rectangle();
		Rectangle r2 = new Rectangle(4, 20);
		System.out.println(r);
		System.out.println(r2);

	}

}
