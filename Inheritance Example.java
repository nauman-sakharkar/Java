class Area
{
	double area(double r)
	{
		return (3.142*r*r);
	}
}

class Volume extends Area
{
	double volume(double a, double b, double r)
	{
		return ((a/b)*3.142*r*r*r);
	}
}

class prac5 extends Volume
{
	public static void main(String args[])
	{
		Volume v = new Volume();
		System.out.println("Area of Circle : "+v.area(Float.parseFloat(args[0])));
		System.out.println("Volume of Sphere : "+v.volume(4.0,3.0,Float.parseFloat(args[0])));
	}
}