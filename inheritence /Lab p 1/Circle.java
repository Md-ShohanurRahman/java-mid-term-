public class Circle extends Shape
{
	public Circle()
	{
		System.out.println("D-Circle");
	}
	public Circle(double x)
	{
		super(x);
		System.out.println("P-Circle");
	}
	
	public double getArea(){return 3.1416*x*x;}
}