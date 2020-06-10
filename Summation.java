package summation;
import java.util.*;

class SummationThread implements Runnable
{
    ArrayList al;
    int number,sum=0;
    public SummationThread(ArrayList a,int n)
    {
        al = a;
        number=n;
    }
    @Override
    public void run() 
    {
        for(int i=1;i<=number;i++)
        {
            sum=sum+i;
        }
        al.add(sum);
    }
}

public class Summation 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        ArrayList al = new ArrayList();
        SummationThread st = new SummationThread(al,sc.nextInt());
        Thread t = new Thread(st);
        t.start();  
        try 
        {
            t.join();
        } 
        catch (InterruptedException ex) {}
        System.out.println("Sum : "+al.get(0));
    }
}
