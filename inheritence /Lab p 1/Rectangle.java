public class Rectangle extends Shape
{
	private double y;
	
	public Rectangle()
	{
		System.out.println("D-Rectangle");
	}
	public Rectangle(double x, double y)
	{
		super(x);
		this.y = y;
		System.out.println("P-Rectangle");
	}
	
	public double getArea(){return x*y;}
}