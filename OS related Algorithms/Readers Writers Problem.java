package readerswriters;

class DB
{
   int count;
   public DB()
   {
      count=0;
   }
    public void read(int no)
    {
        synchronized(this)
        {
            this.count++;
            System.out.println("Reader : "+no+" is reading");
            try 
            {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException ex) { }
             System.out.println("Finished reading : "+no);
             this.count--;
        }
    }
    
    public synchronized void write(int no)
    {
        while(this.count!=0)
        {
            try 
            {
                this.wait();
            } catch (InterruptedException ex) {}
        }
        System.out.println("Writing : "+no+" is writing");
        try 
        {
            Thread.sleep((int)(Math.random()*1000));
        } catch (InterruptedException ex) {}
        System.out.println("Finished writing : "+no);
    }
}

class Readers extends Thread
{
    static int readcount=0;    
    int number;
    DB dbObj;
    
    public Readers(DB dbObj)
    {
        this.dbObj=dbObj;
        readcount++;
        number=readcount;
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            try 
            {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException ex) {}
            dbObj.read(number);
        }
    }
}

class Writers extends Thread
{
    static int writecount=0;    
    int number;
    DB dbObj;
    
    public Writers(DB dbObj)
    {
        this.dbObj=dbObj;
        writecount++;
        number=writecount;
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            try 
            {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException ex) {}
            dbObj.write(number);
        }
    }
}

public class ReadersWriters 
{
    public static void main(String[] args)
    {
        DB dbObject = new DB();
        for(int i=0;i<3;i++)
        {
            new Readers(dbObject).start();
        }
        for(int i=0;i<2;i++)
        {
            new Writers(dbObject).start();
        }
    }
}
