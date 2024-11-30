public class Anik
{
	private int value;
	private String message;
	public Anik()
	{
		System.out.println("Default constructor called");
	}
	
	public Anik(int i)
	{
		value = i;
		System.out.println("Parameterized constructor called" + value);
	}
	
	public String  myFunction(String m)
	{
		message = m;
		//System.out.println("Anik Kumar Saha");
		return message;
	}
	
	public static void main(String[] parameters)
	{
		Anik a1 = new Anik();
		Anik a2 = new Anik(100);
		
		//a1.myFunction();
		String val = a2.myFunction("Adib............");
		System.out.println(val);
	}
}
