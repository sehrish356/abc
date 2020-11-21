// rabia saleem 3837, yusra waheed 3835

import java.util.Scanner;
public class Shape 
{
	Scanner input =new Scanner(System.in);
	private boolean filled;
     private String colour;

public Shape()
{
	colour="green";
	filled=true;
	
}
public Shape(String c,boolean t)
{
	colour=c;
	filled=t;
}
public String getcolour()
{
	return colour;
}
public void setcolour(String n)
{
	colour=n;
}
public boolean isxxx()
{
	return filled;
}
public void setfilled(boolean f)
{
	filled=f;
}
public String tostring()
{
	
		return "a shape with colour of" +getcolour()+ "is " +filled+ "\n";
}		
}