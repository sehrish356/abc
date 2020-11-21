import java.util.Scanner;
import java.util.Scanner;
public class Circle extends Shape
{
	Scanner input =new Scanner(System.in);
	private double radius;
	private double area;
	private double peri;
	public Circle()
	{
		radius=1.0;
	}
	public Circle(double r)
	{
		radius=r;
	}
 Circle(double r, String colour,boolean filled)
	{
	 super(colour,filled);	
		radius=r;
		
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double r)
	{
		radius=r;
	}
	public double getArea()
	{
		area=3.14*radius*radius;
	return 	area;
	}
	public double getPerimeter()
	{
		peri=2*3.14*radius;
		return peri;
	}
	public String tostring()
	{
		
			return "a circle with radius" +getRadius()+ "which is subclass of " + "\n";
	}	
}
