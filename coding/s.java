package coding;
import java.util.*;
class sortin 
{
    int temp;
    
    void bubble(int [] a)
    {
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);

        }

    }
    void selection(int[] a)
    {
    
      for (int i=0;i<a.length;i++)
        {
            int current=i;
            for (int j=i+1;j<a.length;j++)
            {
                
                if (a[i]>a[j])
                {
                    current=j;
                }
                
            }
            
            int temp=a[current];
            a[current]=a[i];
            a[i]=temp;
            
           

        }
        
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);

        }

    }
    public int partition(int []a,int low ,int high)
    {
        int pivot=a[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if (a[j]<pivot)
            {
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=pivot;
        a[high]=temp;
        return i+1;

    }

    public void quicksort (int [] a,int low, int high)
    {
     if (low<high)
     {
        int pi =partition(a,low,high);
        quicksort(a,low,pi-1);
        quicksort(a, pi+1, high);
        
     }   
    }
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

public class s {
    public static void main (String[] args)
    {
        int[] a={3,2,1};;
     sortin f=new sortin();
         f.bubble(a);
         System.out.println("");
        f.selection(a);
         System.out.println("");
       f.quicksort(a,0,a.length-1);
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);

        } 
        System.out.println(""); 
        f.insertion(a,a.length);

    }
    
}
