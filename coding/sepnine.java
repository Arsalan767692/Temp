package coding;
import java.util.*;
class sor
{
     public void insertion(int[] a,int n)
    {
    for (int i=1;i<n;i++)
    {
        int current =a[i];
        int j=i-1;
            while (j>=0 && current<a[j])
            {
                a[i]=a[j];
                j--;
                i--;
            }
        a[j+1]=current;
    }
 for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);

        }


    }
}
class greedy
{
    public void gree(int[]w,int[] p,int t)
    {
      int u=0;
      int i;
      int sum=0;
      ArrayList<Integer> f=new ArrayList<Integer>();
       
        
            while (u<t)
            {
                 for (i=w.length-1;i>=0;i--)
                 {
                    if (u<t)
                    {
                f.add(p[i]);
                
                u=u+w[i];
                    }

            }
           
            
            if(t-u!=0)
            {
                f.add(p[i]*(int)((w[i]/(t-u))));
                t=t+w[i]/(t-u);
            }
        }
        for (int n:f)
        {
            sum=sum+n;
            
        }
        System.out.println(sum);

          
        }
       
        
    
    public void first(int[]b,int[]p,int []w,int t)
    {
        float[]u=new float[p.length];
        for (int i=0;i<u.length;i++)
        {
            u[i]=(float)p[i]/w[i];
        }
        for (int i=0;i<u.length;i++)
    {
        for(int j=i;j<u.length;j++)
        {
            if(u[i]>u[j])
            {
                float temp=u[i];
                u[i]=u[j];
                u[j]=temp;
                int tem=w[i];
                w[i]=w[j];
                w[j]=tem;
                 int te=p[i];
                p[i]=p[j];
                p[j]=te;
                
            }
        }
    }
    gree(w,p,t);        
    }
    public void test()
    {
        int sum=0;
        int count=0;
        int t=100;
        int n=t/2;
        for (int i=n;i>=1;i--)
        {

            if ((sum+(i*i))<=t)
            {
                sum=sum+(i*i);
               count=count+1;
            }

        }
        System.out.println(count);

    }
    
}

public class sepnine {
    public static  void main(String args[])
    {
    sor g=new sor();
   int[] a={3,2,1};
   g.insertion(a,a.length);
    int [] b={1,2,3,4,5,6,7};
    int [] p={10,4,15,7,6,16,3};
    int [] w={2,2,5,7,1,4,1};
    int t=15;
   greedy f=new greedy();
    f.first(b,p,w,t);
        f.test();
}
}
