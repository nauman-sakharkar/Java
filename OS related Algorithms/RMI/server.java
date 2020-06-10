import java.rmi.*;

class server
{
	public static void main(String args[])
	{
		try
		{
			calcinter c = new calcimpl();
			Naming.rebind("rmi://localhost/naumancalc",c);
		}
		catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
	}
}