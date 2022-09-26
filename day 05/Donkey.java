
public class Donkey
{
	public int numLegs = 4;
	public String status = "Standing";
	
	public void walk()
	{
		status = "Walking";
	}
	public void stop()
	{
		status = "Standing";
	}
	public void haveAccident()
	{
		numLegs = numLegs - 1;
	}
	public void haveAccident(int severity)
	{
		numLegs = numLegs - severity;
	}
	public static void main(String[] args)
	{
		Donkey mabel = new Donkey();
		Donkey chuck = new Donkey();
		
		System.out.println(mabel.numLegs);
		System.out.println(mabel.status);
		mabel.haveAccident();
		mabel = chuck;
		System.out.println(mabel.numLegs);
		System.out.println(chuck.numLegs);
	}
}
