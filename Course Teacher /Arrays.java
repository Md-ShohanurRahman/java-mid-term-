import java.util.Scanner;

public class Arrays
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println();
		System.out.println("1D array");
		System.out.println("Approach - 1 (Size is known to us)");

		int arr1[] = new int[5];
		
		for(int i=0; i<5; i++)
		{
			arr1[i] = input.nextInt();
		}
		
		for(int i=0; i<5; i++)
		{
			System.out.print(arr1[i] + "   ");
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("1D array");
		System.out.println("Approach - 2 (values are known to us)");

		int arr2[] = new int[] {111, 222, 333, 444, 555};
		
		for(int i=0; i<5; i++)
		{
			System.out.print(arr2[i] + "   ");
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("1D array");
		System.out.println("Approach - 3 (Size and values both are unknown to us)");

		int arr3[];
		System.out.print("Enter array size: ");
		int size = input.nextInt();
		arr3 = new int[size];
		
		for(int i=0; i<size; i++)
		{
			arr1[i] = input.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			System.out.print(arr1[i] + "   ");
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("2D array");
		System.out.println("Approach - 1 (Size is known to us)");

		int arr4[][] = new int[2][3];
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr4[i][j] = input.nextInt();
			}
		}
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr4[i][j] + "   ");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("2D array");
		System.out.println("Approach - 2 (values are known to us)");

		int arr5[][] = new int[][] { {111, 222, 3434343}, {333, 444, 555} };
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr5[i][j] + "   ");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("2D array");
		System.out.println("Approach - 3 (Size and values both are unknown to us)");

		int arr6[][];
		System.out.print("Enter array row size: ");
		int rowSize = input.nextInt();
		System.out.print("Enter array column size: ");
		int columnSize = input.nextInt();
		arr6 = new int[rowSize][columnSize];
		
		for(int i=0; i<rowSize; i++)
		{
			for(int j=0; j<columnSize; j++)
			{
				arr5[i][j] = input.nextInt();
			}
		}
		
		for(int i=0; i<rowSize; i++)
		{
			for(int j=0; j<columnSize; j++)
			{
				System.out.print(arr5[i][j] + "   ");
			}
			System.out.println();
		}
	}
}