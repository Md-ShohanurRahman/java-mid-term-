public class Start
{
	public static void main(String [] args)
	{
		//Circle c1 = new Circle();
		//Circle c2 = new Circle(5.5);
		//System.out.println(c2.getArea());
		
		//c2.setX(10.5);
		//System.out.println(c2.getArea());
		
		Rectangle r2 = new Rectangle(5.5, 6.6);
		System.out.println(r2.getArea());
		Triangle t2=new Triangle(5.5,6.5);
		System.out.println(t2.getArea());
		Trapezoid tr2=new Trapezoid(2,64,111);
		System.out.println(tr2.getArea());

	}
}