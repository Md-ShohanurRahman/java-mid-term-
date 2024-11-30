public class TypeCasting
{
	public static void main(String[] Parameters)
	{
		char c1 = 'a', c2 = 'b';
		float f1 = 5.5F, f2 = 10.5F;
		
		System.out.print("Implicit Type Casting:  ");
		f1 = c1;
		System.out.println(f1);
		
		System.out.print("Explicit Type Casting:  ");
		c2 = (char)f2;
		System.out.println(c2);
	}
}