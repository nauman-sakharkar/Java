package sjf_sched;
import java.util.*;

public class SJF_sched 
{
    public static void main(String args[])
    {
        int id[] = new int[20];
        int btime[] = new int[20];
        int wtime[] = new int[20];
        int total=0;
        float avg;
        Scanner sn = new Scanner(System.in);
        System.out.print("\nEnter the number of processes : ");
        int n = sn.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("\nEnter the processes ID of process "+(i+1)+" : ");
            id[i] = sn.nextInt();
            System.out.print("\nEnter the burst time of process "+(i+1)+" : ");
            btime[i] = sn.nextInt();
        }
        int min,j,temp;
        for(int i=0;i<n;i++)
        {
            min=i;
            for(j=(i+1);j<n;j++)
            {
                if(btime[min]>btime[j])
                {
                    min=j;
                }
            }
            temp = btime[i];
            btime[i]=btime[min];
            btime[min]=temp;
            temp = id[i];
            id[i]=id[min];
            id[min]=temp;
        }
        
        wtime[0]=0;
        for(int i=1;i<n;i++)
        {
            wtime[i] = wtime[i-1]+btime[i-1];
            total = total + wtime[i];
        }
        avg = (float)total/n;
        System.out.println("\nProcess_ID\tBurst_time\tWait_time");
        for(int i=0;i<n;i++)
        {
            System.out.println(id[i]+"\t\t"+btime[i]+"\t\t"+wtime[i]);
        }
        System.out.println("\nTotal wait time: "+total+"\nAverage wait time: "+avg);
    }
}
