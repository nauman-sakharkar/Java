class Area
{
	Area(int x)
	{
		System.out.println(x*x*(Math.sqrt(3)/4));
	}
	Area(int x, int y)
	{
		System.out.println(.5*x*y);
	}
	Area(int x, int y, int z)
	{
		int s=(x+y+z)/2;
		System.out.println(Math.sqrt(s*(s-x)*(s-y)*(s-z)));
	}
}


class prac6
{
	public static void main(String args[])
	{
		if (args.length==1)
		{
			int a=Integer.parseInt(args[0]);
			Area o1 = new Area(a);
		}
		else if(args.length==2)
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			Area o2 = new Area(a,b);
		}
		else
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			Area o3 = new Area(a,b,c);
		}
	}
}