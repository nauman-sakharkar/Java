package fibonacci;
import java.util.*;

class fib implements Runnable
{
    int term,tmp,x1=0,x2=1;
    ArrayList fibo;
    fib(int n, ArrayList fibs)
    {
        fibo=fibs;
        fibo.add(0);
        fibo.add(1);
        term=n;
    }
    
    @Override
    public void run() 
    {
        for(int i=1;i<term;i++)
        {
            tmp=x1;
            x1=x2;
            x2=x2+tmp;
            fibo.add(x2);
        }
    }
}

public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList fib = new ArrayList();
        System.out.print("Enter the nth term : ");
        fib f = new fib(sc.nextInt(),fib);
        Thread t =new Thread(f);
        t.start();
        try {
            t.join();
        } catch (InterruptedException ex) {
        }
         System.out.print("Fibonacci Series : ");
        for (Object o : fib)
        {
            System.out.print(o+"\t");
        }
        System.out.println("");
    }
}
