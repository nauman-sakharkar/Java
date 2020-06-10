package producerconsumerproblem;

class Buffer
{
    int numbers[],in,out,count,size;
    public Buffer(int capacity)
    {
        numbers = new int[capacity];
        in=out=count=0;
        size=capacity;
    }
    public int produce()
    {
        while(count==size);
        numbers[in]=500;
        in=(in+1)%size;
        count++;
        return 500;
    }
    public int consume()
    {
        while(count==0);
        int data = numbers[out];
        out=(out+1)%size;
        count--;
        return data;
    }
}

class Producer implements Runnable
{
    Buffer b;
    public Producer(Buffer b)
    {
        this.b=b;
    }
    
    @Override
    public void run() 
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Produced : "+b.produce());
        }
    }
}

class Consumer implements Runnable
{
    Buffer b;
    public Consumer(Buffer b)
    {
        this.b=b;
    }
    
    @Override
    public void run() 
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Consumed : "+b.consume());
        }
    }
}

public class ProducerConsumerProblem 
{
    public static void main(String[] args) 
    {
        Buffer b = new Buffer(5);
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}