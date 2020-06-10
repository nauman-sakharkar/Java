package fifoalgorithm;
import java.util.*;

class FIFO
{
	Queue<Integer> fifoqueue = new ArrayDeque<Integer>(3);
	int []referenceString = new int[]{1,2,3,4,5,2,4,7,1,2} ;
	int hitcount,faultcount;
	public FIFO()
	{
		hitcount = 0;
		faultcount = 0;
	}
	public void init()
	{
		for(int i=0;i<10;i++)
		{
			System.out.print(referenceString[i]+"\t");
		}
                System.out.print("\n");
	}
	public void runFIFO()
	{
		for(int pageRef : referenceString)
		{
			if(fifoqueue.contains(pageRef))
			{
				hitcount = hitcount + 1;
			}
			else if(fifoqueue.size() == 3)
			{
				faultcount = faultcount + 1;
				fifoqueue.poll();
				fifoqueue.add(pageRef);
				for(Integer s : fifoqueue)
				{
					System.out.print(s.toString()+"\t");
				}
			}
			else
			{
				faultcount = faultcount + 1;
				fifoqueue.add(pageRef);
				for(Integer s : fifoqueue)
				{
					System.out.print(s.toString()+"\t");
				}
			}
			System.out.println();
		}
		System.out.println("Hit count: "+hitcount);
		System.out.println("Fault count: "+faultcount);
	}
}

public class FIFOAlgorithm 
{
    public static void main(String[] args) 
    {
        FIFO f = new FIFO();
        f.init();
        f.runFIFO();
    }
}
