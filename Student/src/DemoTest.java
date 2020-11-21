import java.util.Scanner;
public class DemoTest 
{
	public static void main(String args[])
	{
	
	Shape s1 = new Circle(5.5, "red", false);  
	System.out.println(s1);                    
	System.out.println(s1.getArea());          
	System.out.println(s1.getPerimeter());     
	System.out.println(s1.getcolour());
	System.out.println(s1.isxxx());
	   
	Circle c1 = (Circle)s1;                   // Downcast back to Circle
	System.out.println(c1);
	System.out.println(c1.getArea());
	System.out.println(c1.getPerimeter());
	System.out.println(c1.getcolour());
	System.out.println(c1.isxxx());
	System.out.println(c1.getRadius());
	   
	Shape s2 = new Shape();
	   
	Shape s3 = new Rectangle(1.0, 2.0, "red", false);   
	System.out.println(s3);
	System.out.println(s3.getArea());
	System.out.println(s3.getPerimeter());
	System.out.println(s3.getcolour());
	System.out.println(s3.getLength());
	   
	Rectangle r1 = (Rectangle)s3;   
	System.out.println(r1);
	System.out.println(r1.getArea());
	System.out.println(r1.getcolour());
	System.out.println(r1.getLength());
	   
	Shape s4 = new Square(6.6);     
	System.out.println(s4);
	System.out.println(s4.getArea());
	System.out.println(s4.getcolour());
	System.out.println(s4.getside());
	  
	Rectangle r2 = (Rectangle)s4;
	System.out.println(r2);
	System.out.println(r2.getArea());
	System.out.println(r2.getcolour());
	System.out.println(r2.getside());
	System.out.println(r2.getLength());
	   
	Square sq1 = (Square)r2;
	System.out.println(sq1);
	System.out.println(sq1.getArea());
	System.out.println(sq1.getColor());
	System.out.println(sq1.getSide());
	System.out.println(sq1.getLength());
}
}
