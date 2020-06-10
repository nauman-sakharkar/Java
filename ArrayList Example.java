import java.util.*;

class prac9
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
	    al.add(54);
	    al.add("test");
	    al.add(0,"overloading");
		System.out.print("List : ");
		System.out.println(al);  
		System.out.println("Iterating list : ");
	    for(Object s:al)
		{  
			 System.out.println(s);  
		}  
		System.out.println("traversing elements in forward direction...");  
		ListIterator itr = al.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());  
		}
		System.out.println("traversing elements in backward direction...");  
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());  
		}
	}
}