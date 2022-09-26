/**
 * 
 * @author thumay
 *
 *
 *Sample UML
 *
 *Chicken
 *-----------
 * - isAlive : boolean
 * - ageInDays : int
 * - hoursToMakeEgg : int
 * -----------
 * + cluck
 * - layEgg : Egg
 * -----------
 */
public class Chicken 
{
	//STATE
	private boolean isAlive = true;
	private int ageInDays = 0;
	private static int hoursToMakeEgg = 26;
	
	
	public static void main(String[] args)
	{
		Chicken zena = new Chicken();
		Chicken hera = new Chicken();
		
		System.out.println(zena.getAgeInDays());
		System.out.println(hera.getAgeInDays());
		System.out.println(zena.getHoursToMakeEgg());
		System.out.println(hera.getHoursToMakeEgg());
		
		zena.setAgeInDays(100);
		zena.setHoursToMakeEgg(15);
		System.out.println(zena.getAgeInDays());
		System.out.println(hera.getAgeInDays());
		System.out.println(zena.getHoursToMakeEgg());
		System.out.println(hera.getHoursToMakeEgg());
	}
	//BEHAVIOR
	public void cluck()
	{
		System.out.println("cluck!");
	}
	private Egg layEgg()
	{
		Egg e = new Egg();
		return e;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public int getAgeInDays() {
		return ageInDays;
	}
	public void setAgeInDays(int ageInDays) {
		this.ageInDays = ageInDays;
	}
	public static int getHoursToMakeEgg() {
		return hoursToMakeEgg;
	}
	public static void setHoursToMakeEgg(int hoursToMakeEgg) {
		Chicken.hoursToMakeEgg = hoursToMakeEgg;
	}
	
}

class Egg
{

}