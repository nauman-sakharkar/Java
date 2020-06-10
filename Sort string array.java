class Prac3
{
	public static void main(String args[])
	{
		int count = Integer.parseInt(args[0]);
		String str[] = new String[10];
		int temp;
		int i,j;
		for (i = 1; i <= count;i++)
		{
			str[i-1] = args[i];
		}
		for (i = 0;i < count;i++)
		{
			temp = i;
			
			for (j = (i+1);j < count;j++)
			{
				if (str[temp].compareTo(str[j])>0)
				{
					temp = j;
				}
			}
			String t = str[i];
			str[i] = str[temp];
			str[temp] = t;
		}
		for (i = 0; i < count;i++)
		{
			System.out.println(str[i]);
		}
	}
}