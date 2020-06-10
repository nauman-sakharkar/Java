package prime;
import java.util.*;

class checkPrime implements Runnable
{
    int num,f=1;
    ArrayList primelist;
    checkPrime(ArrayList list, int n)
    {
        num=n;
        primelist=list;
    }
    @Override
    public void run() 
    {
        for (int j = 2;j<=num;j++)
        {
            f=1;
            for (int i=2;i<((j/2)+1);i++)
            {
                if (j%i==0)
                {
                    f=0;break;
                }
            }
            if (f==1) 
            {primelist.add(j);}
        }
    }
}
public class Prime 
{
    public static void main(String[] args) 
    {
        int endnum;
        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range : ");
        endnum=sc.nextInt();
        if (endnum>1)
        {
            checkPrime pr = new checkPrime(list, endnum);
            Thread t1 = new Thread(pr);
            t1.start();
            try 
            {
                t1.join();
            } 
            catch (InterruptedException ex) { }
            System.out.println("Prime Numbers in the given range :");
            for(Object i : list)
            {
                System.out.println(i);
            }
        }
    }
}
