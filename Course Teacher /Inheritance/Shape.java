public class Shape
{
	protected double x;
	
	public Shape()
	{
		System.out.println("D-Shape");
	}
	
	public Shape(double x)
	{
		this.x = x;
		System.out.println("P-Shape");
	}
	
	public void setX(double x){this.x = x;}
	public double getX(){return x;}
	public double getArea(){return 9.99;}
}