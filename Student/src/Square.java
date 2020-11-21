import java.util.Scanner;
public class Square extends Rectangle
{
	Scanner input =new Scanner(System.in);
private double side;
public Square()
{
	side=1.0;
}
public Square(double s)
{
	side=s;
}
public Square(double s,String colour, boolean filled)
{
	super(s,s,colour,filled);
	side=s;
	
}
public double getSide()
{
	return side;
}
public void setSide(double s)
{
	side=s;
}

/*public void setWith(double w)
{
	super.Width=w;
}
public void setLength(double l)
{
	Length=l;
}*/
public String tostring()
{
	
		return "a square with sides" +getSide()+ "which is subclass of " + "\n";
}
}
