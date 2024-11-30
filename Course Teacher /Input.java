import java.util.Scanner;

public class Input 
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an integer: ");

		int number = s.nextInt();
		System.out.println("You entered: " + number);

        s.close();
    }
}
