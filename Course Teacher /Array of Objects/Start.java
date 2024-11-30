public class Start
{
	public static void main(String [] args)
	{
		System.out.println();
		System.out.println();
		System.out.println("********** BOX - 1 **********");
		System.out.println();
		
		Box b1 = new Box();
		
		b1.setLength(10.5);
		b1.setWidth(11.5);
		b1.setHeight(12.5);
		
		System.out.println("Length is: " + b1.getLength());
		System.out.println("Width is: " + b1.getWidth());
		System.out.println("Height is: " + b1.getHeight());
		
		System.out.println();
		System.out.println();
		
		System.out.println("********** BOX - 2 **********");
		System.out.println();
		
		Box b2 = new Box();
		
		b2.setLength(10.522);
		b2.setWidth(11.522);
		b2.setHeight(12.522);
		
		System.out.println("Length is: " + b2.getLength());
		System.out.println("Width is: " + b2.getWidth());
		System.out.println("Height is: " + b2.getHeight());
		
		System.out.println();
		System.out.println();
		
		System.out.println("********** Boxes from array of object **********");
		System.out.println();
		
		Box boxes[] = new Box[10];
		
		boxes[2] = b1;
		boxes[5] = b2;
		
		for(int i=0; i<10; i++)
		{
			if(boxes[i] != null)
			{
				System.out.println("Length of box stored in index - " + i + " : " + boxes[i].getLength());
				System.out.println("Width of box stored in index - " + i + " : " + boxes[i].getWidth());
				System.out.println("Height of box stored in index - " + i + " : " + boxes[i].getHeight());
			}
			else
			{
				System.out.println("No box found in index - " + i);
			}
		}
	}
}