
public class FirstYear extends Student
{
	
	@Override
	public String toString()
	{
		return "this is FirstYear's toString " +this.getName();
	}
	public static void main(String[] args)
	{
		FirstYear jill = new FirstYear();
		jill.setName("Jill");
		jill.setGpa(4.0);
		jill.setAge(19);
		System.out.println(jill);
	}
}