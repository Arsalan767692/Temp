package coding;//BRUCE FORTE
class search
{
    public void s(String u,String pa)
    {
        int ls=u.length();
        int lp=pa.length();
        int max=ls-lp+1;
        int j;
        for (int i=1;i<=max;i++)
        {
            boolean flag =true;
            for ( j=0;j<lp && flag==true;j++)
            {
                if (pa.charAt(j)!=u.charAt(i+j-1))
                {
                    flag=false;

                }
            }
            if (flag==true)
            {
                System.out.println(j);
                break;
            }
        }
    }
}

public class stringsearch {
    public static void main(String args[])
    {
        search s=new search();
        s.s("AUDABCAGD","ABC");

        
    }
    
}
