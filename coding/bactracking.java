package coding;
class bac
{
    public void rec(String str,String permutation)
    {
      
        if (str.length()==0)
        {
            System.out.println(permutation);
            return;
        }

    for (int i=0;i<str.length();i++)
    {
        char current=str.charAt(i);
        String newstring=str.substring(0, i)+str.substring(i+1);
        rec(newstring,permutation+current);

    }
    }
}
public class bactracking {
    public static void main (String args[])
    {
        String str="abc";
        bac b=new bac();
        b.rec(str, "");

    }
    
}
