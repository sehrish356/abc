import java.util.Scanner;
public class Rectangle extends Shape
{
	Scanner input =new Scanner(System.in);
private double Width;
private double Length;
private double area;
private double peri;
public Rectangle()
{
	Width=1.0;
	Length=1.0;
}
public Rectangle(double w,double l)
{
	Width=w;
	Length=l;
}
public Rectangle(double w,double l,String colour, boolean filled)
{
	super(colour,filled);
	Width=w;
	Length=l;
	
}
public double getWidth()
{
	return Width;
}
public void setWith(double w)
{
	Width=w;
}
public double getLength()
{
	return Length;
}
public void setLength(double l)
{
	Length=l;
}
public double getArea()
{
	area=Length*Width;
return 	area;
}
public double getPerimeter()
{
	peri=2*Length+2*Width;
	return peri;
}
public String tostring()
{
	
		return "a rectangle with width" +getWidth()+ "and length " +getLength()+"which is subclass of " + "\n";
}	
}
