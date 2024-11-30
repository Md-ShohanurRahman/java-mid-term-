public class Functions
{
	private String message;
	
	public void MyFunctions(String m)
	{
		message = m;
		System.out.println(message);
	}
	
	public String MyNewFunctions(String m)
	{
		message = m;
		return message;
	}
	
	public static void main(String[] Parameters)
	{
		Functions f1 = new Functions();
		f1.MyFunctions("Hello Students");
		
		Functions f2 = new Functions();
		String msg = f2.MyNewFunctions("Hello Polapain");
		System.out.println(msg);
	}
}