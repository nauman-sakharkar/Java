class Prac1
{
	public static void main(String args[])
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		int d = (b*b)-(4*a*c);
		if (d>0)
		{
			double x1=(-b+Math.sqrt(d))/(2*a);
			double x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Roots are Real and Unequal");
			System.out.println("Roots are : "+x1+" & "+x2);
		}
		else if (d==0)
		{
			double x1=(-b)/(2*a);
			System.out.println("Roots are Real and Equal");
			System.out.println("Roots are : "+x1+" & "+x1);
		}
		else if (d<0)
		{
			d=-d;
			System.out.println("Roots are Imaginary");
			System.out.println("Roots are : [ "+-b+"+"+Math.sqrt(d)+"i ]/"+2*a);
			System.out.println("Roots are : [ "+-b+"-"+Math.sqrt(d)+"i ]/"+2*a);
		}
	}
}