import Areas.*;

class prac4 implements Areas
{
	public double areaOfCircle(int r)
	{
		return (3.142*r*r);
	}
	public int areaOfRectangle(int l, int b)
	{
		return(l*b);
	}
	public int areaOfSquare(int s)
	{
		return (s*s);
	}
	
	public static void main(String args[])
	{
		prac4 area = new prac4();
		System.out.println("Area of Circle : "+area.areaOfCircle(Integer.parseInt(args[0])));
		System.out.println("Area of Rectangle : "+area.areaOfRectangle(Integer.parseInt(args[1]),Integer.parseInt(args[2])));
		System.out.println("Area of Square : "+area.areaOfSquare(Integer.parseInt(args[3])));
	}
}