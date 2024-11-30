public class Parse 
{
    public static void main(String[] args) 
	{
        String numberString = "123";
 
		int number = Integer.parseInt(numberString);
		System.out.println("The integer value is: " + number);

		System.out.println("Double of that number = " + (number + number));
    }
}
