package coding;
import java.util.*;
import java.io.*;
import java.util.Hashtable;

public class hashtable{
    public static void main(String args[])
    {
     Hashtable <String,Integer> m=new Hashtable<>();
        m.put("Samsung",123456);
        m.put("apple",789465);
        m.put("microsoft",10000);
        Enumeration<String> keys=m.keys();
        while (keys.hasMoreElements())
        {
            String key=keys.nextElement();
            System.out.println("Product "+key+" Price "+m.get(key));
        }
    
}
}
