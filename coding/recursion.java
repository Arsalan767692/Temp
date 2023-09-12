package coding;
class re
{
    public int first=-1;
    public int last=-1;
    void print (int n)
    {
        if (n==0)
        {
            return;

        }
        else
        {
            System.out.println(n);
            print(n-1);

        }
    }
    void reprint (int n)
    {
        if (n==6)
        {
            return;

        }
        else
        {
            System.out.println(n);
            reprint(n+1);

        }
    }
    int sum(int n)
    {
        if (n<=0)
        {
            
            return 0;
        }
        else
        {
            return n+sum(n-1);
        }

    }
    int fact(int n)
    {
        if (n<=0)
        {
            
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }

    }
    void fib(int a,int b,int n)
    {
        if (n==0)
        {
            return;
        }
        else{
            int c=a+b;
            System.out.println(c);
            fib(b,c,n-1);

        }

    }
    int pow(int x,int n)
    {
        if (n==0 )
        {
            return 1;
        }
        else
        {
            return x*pow(x,n-1);
        }

    }
    void rev(String str,int n)
    {
        if (n==0)
        {
            System.out.print(str.charAt(0));
            return;
        }
       
            System.out.print(str.charAt(n));
             rev(str,n-1);
            
        

    }
   
     void occurance (String str, char e,int n)
     { 

        if (n==str.length())
        {
            System.out.println("\n"+first);
            System.out.println(last);
            return;

        }
        if (str.charAt(n)==e)
        {
        if (first==-1)
        {
            first=n;
        }
        else
        {
            last=n;
        }
         
    }
    occurance ( str,e,n+1);
    


     }
     boolean v=true;
     void checkarray(int[] a,int b)
     {
        if (b>=a.length)
        {
            System.out.println(v);
            return;
        }
        for (int i=b+1;i<a.length;i++)
        {
            if (a[b]>a[i])
            {
                v=false;
            }
        }
        checkarray(a, b+1);

        

     }
    
}
public class recursion
{
    public static void main( String[] args)
    {
        re a=new re();
        a.print(5);
        a.reprint(1);
        int s=a.sum(10);
        System.out.println(s);
        int r=a.fact(4);
        System.out.println(r);
        System.out.println(0+"\n"+1);
        a.fib(0,1,5);
        int u=a.pow(2, 4);
        System.out.println(u);
        String p="ABC";
        System.out.println(p.substring(1  ));
        a.rev("ABCD", 3);
        a.occurance("aaabfbdjkjknfdjaaa",'a', 0);
        int[]m={1,2,3,7,5};
        a.checkarray(m, 0);


    }
}