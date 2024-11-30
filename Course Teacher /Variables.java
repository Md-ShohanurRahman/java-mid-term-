public class Variables
{
	//Class variable
	private static int ClassVar = 10;
	
	//Instance variable
	public int InsVar = 20;
	
	public static void main(String[] args)
	{
		//Local variable
		int b = 10;
		for(int i=0; i<5; i++)
		{
			System.out.println(i);
		}
		if(b%2 == 0)
		{
			System.out.println("Even");
		}
		
		//Accessing class variable
		System.out.println(Variables.ClassVar);
		
		//Accessing instance variable
		Variables v = new Variables();
		System.out.println(v.InsVar);
	}
}