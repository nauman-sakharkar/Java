import java.rmi.*;

class client
{
	public static void main(String args[])
	{
		try
		{
			calcinter c = (calcinter)Naming.lookup("rmi://localhost/naumancalc");
			System.out.println(c.add(2,3));
			System.out.println(c.sub(2,3));
			System.out.println(c.mul(2,3));
			System.out.println(c.div(4,2));
			
		}
		catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
	}
	
}