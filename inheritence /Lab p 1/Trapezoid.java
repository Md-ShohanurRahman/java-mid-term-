public class Trapezoid extends Shape
{private double m;
    private double n;
	public Trapezoid()
	{
		System.out.println("D-Trapezoid");
	}
	public Trapezoid (double x ,double m, double n)

	{
		super(x);
		this.m=m;
        this.n=n;
		System.out.println("Trapezoid");
	}
	
	public double getArea(){return (((m+n)/x)*0.5);}
}