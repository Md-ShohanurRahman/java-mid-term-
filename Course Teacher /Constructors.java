public class Constructors
{
	private int value;
	
	public Constructors()
	{
		System.out.println("Default constructor called");
	}
	
	public Constructors(int i)
	{
		value = i;
		System.out.println("Parameterized constructor called:  " + value);
	}
	
	public static void main(String[] Parameters)
	{
		Constructors c1 = new Constructors();
		Constructors c2 = new Constructors(100);
	}
}