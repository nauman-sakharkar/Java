package lrualgorithm;
import java.util.*;

class LRU
{
    ArrayList<Integer> LRUlist = new ArrayList<Integer>(3);
    ArrayList<Integer> preference = new ArrayList<Integer>(3);
    int []referenceString = new int[]{7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0,1,7,0,1} ;
    int hitcount,faultcount,index;
    public LRU()
    {
        hitcount = faultcount = 0;
    }
    public void init()
    {
        for(int i=0;i<10;i++)
        {
                System.out.print(referenceString[i]+"\t");
        }
        System.out.print("\n");
    }
    public void runLRU()
    {
        for(int pageRef : referenceString)
        {
            if(LRUlist.contains(pageRef))
            {
               hitcount = hitcount + 1;
               preference.add(preference.remove(preference.indexOf(pageRef)));
            }
            else if(LRUlist.size() == 3)
            {
                faultcount = faultcount + 1;
                index = LRUlist.indexOf(preference.get(0));
                LRUlist.remove(index);
                preference.remove(0);
                LRUlist.add(index,pageRef);
                preference.add(pageRef);
                for(Integer s : LRUlist)
                {
                    System.out.print(s.toString()+"\t");
                }
            }
            else
            {
                faultcount = faultcount + 1;
                LRUlist.add(pageRef);
                preference.add(pageRef);
                for(Integer s : LRUlist)
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

public class LRUAlgorithm 
{
    public static void main(String[] args) 
    {
        LRU l = new LRU();
        l.init();
        l.runLRU();
    }
}
