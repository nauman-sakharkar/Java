class myException extends Exception
{
	myException(String message)
	{
		super(message);
	}
}

class prac7
{
	public static void main(String args[])
	{
		try
		{
			int a[]={2,5};
			int c = a[1];
			if (c==5)
			{
				throw new myException("Number is Less than 5");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception");
			System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Array Index Out of Bound Exception");
			System.out.println(ai.getMessage());
		}
		catch(ArrayStoreException ase)
		{
			System.out.println("Array Store Exception");
			System.out.println(ase.getMessage());
		}
		catch (myException mE)
		{
			System.out.println("My Exception");
			System.out.println(mE.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}