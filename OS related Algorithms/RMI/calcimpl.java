import java.rmi.*;
import java.rmi.server.*;

class calcimpl extends UnicastRemoteObject implements calcinter
{
	public calcimpl() throws RemoteException
	{
		super();
	}
	
	public int add(int x,int y)
	{
		return x+y;
	}
	
	public int sub(int x,int y)
	{
		return x-y;
	}
	
	public int mul(int x,int y)
	{
		return x*y;
	}
	
	public int div(int x,int y)
	{
		return x/y;
	}
}