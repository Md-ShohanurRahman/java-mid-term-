public class Triangle extends Shape
{private double z;
	public Triangle()
	{
		System.out.println("D-Triangle");
	}
	public Triangle (double x ,double z)

	{
		super(x);
		this.z=z;
		System.out.println("P-Triangle");
	}
	
	public double getArea(){return 0.5*x*z;}
}