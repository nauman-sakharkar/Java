package bankersalgorithm;
import java.io.IOException;
import java.util.Scanner;

public class BankersAlgorithm     
{
    static int safe[]=new int[20];
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.print("Enter no. of processes : ");
        n=sc.nextInt();
        System.out.print("Enter no. of resources : ");
        m=sc.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++)
        {
            System.out.print("Enter no. of available instances resources "+i+" : ");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter allocation of resources");
        int al[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("Enter allocation instances of resources "+j+" for process p"+i+" : "); 
                al[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter maximum of resources");
        int max[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("Enter max instances of resources "+j+" for process p"+i+" : ");    
                max[i][j]=sc.nextInt();
            }
        }
        int need[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {    
                need[i][j]=max[i][j]-al[i][j];
            }
        }
        System.out.println("Need Matrix : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("\t"+need[i][j]); 
            }
            System.out.println("\n");
        }
        int work[]=new int[m];
        work=a.clone();
        boolean finish[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            finish[i]=false;
        }
        int cnt=0;
        int att=0;
        boolean alldone;
        do
        {
            for(int i=0;i<n;i++)
            {
                boolean flag=true;
                if(finish[i]==false)
                {	
                    for(int j=0;j<m;j++)
                    {
                        if(work[j]<need[i][j])
                        {
                            flag=false;
                            
                        }
                    }
                    if(flag)
                    {
                        for(int j=0;j<m;j++)
                        {
                            work[j]+=al[i][j];
                        }
                        safe[cnt]=i;
                        cnt++;
                        finish[i]=true;
                    }
                }   	
            }
            alldone=true;
            for(int i=0;i<n;i++)
            {
               if(finish[i]==false)
               {
                   alldone=false;
               }
               
            }
            att++;
        } while(alldone==false && att<n);
        if(alldone==true)
        {
            System.out.println("System in Safe State");
            System.out.println("System's Safe sequence:");
            for(int i=0;i<n;i++)
            {
                System.out.println(safe[i]+" ");
            }
        }
        else
        {
            System.out.println("System in UnSafe State");
        }
        
    }
}