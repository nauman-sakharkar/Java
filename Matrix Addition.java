class Prac2
{
	public static void main(String args[])
	{
		int r1 = Integer.parseInt(args[0]);
		int c1 = Integer.parseInt(args[1]);
		int r2 = Integer.parseInt(args[2]);
		int c2 = Integer.parseInt(args[3]);
		if (r1==r2 && c1==c2)
		{
			int m2 = (r1*c1)+4;
			int m1 = 4;
			System.out.println("Matrix Addition\n----------------------------------------------");
			for (int i=0;i<r1;i++)
			{
				for (int j=0;j<c1;j++)
				{
					System.out.print(Integer.parseInt(args[m1])+Integer.parseInt(args[m2])+"\t");
					m1++;m2++;
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Sorry, rows or columns of Matrices doesn't matches");
		}
	}
}