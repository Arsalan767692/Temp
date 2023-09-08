package coding;
import java.util.*;
import java.io.*;
class trying
{
    
     void array()
    {
        Scanner sc=new Scanner(System.in);
        String[] name= new String[6];
        System.out.println("Enter names");
        for(int i=0;i<4;i++)
        {
            name[i]=sc.next();
        }
        for (int j=0;j<4;j++)
        {
            System.out.println(name[j]);
        }
        
    }
    void linked()
    {
        System.out.println("LInked List");
        LinkedList<String> ll = new LinkedList<String>();
  
        
        ll.add("Arsalan");
        ll.add("Abdul");
        ll.addLast("Krish");
        ll.addFirst("Danudh");
        ll.add(2,"Ayaz");
  
        System.out.println(ll);
  
        ll.remove("Ayaz");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
        
  
        System.out.println(ll);
    }

    void stack()//lifo
    {
         System.out.println("Stack");
         Stack<Integer> stack = new Stack<Integer>();
         stack.push(25);
         stack.push(113);  
         stack.push(90);  
         stack.push(120);  
         System.out.println(stack);
         System.out.println(stack.peek());
          boolean result=stack.empty();
          System.out.println("The stack is empty "+result);
          stack.pop();
          System.out.println(stack);
          int s=stack.search(25);
          System.out.println(s);



 
    }
    void queue()//fifo
    {
         System.out.println("Queue");
      Queue <String> q=new LinkedList<> ();
      q.add("Arsalan");
      q.add("Abdul");
      q.add("Ayaz");
      q.add("Shurabeel");
      System.out.println(q.peek());
      q.remove();
      System.out.println(q);
      q.poll();
      System.out.println(q);
   





    }
    void hastable()
    {
         System.out.println("hastable");
        Hashtable<String, Integer> hashtable = new Hashtable<>();
 
       
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);
 
        
        int valueA = hashtable.get("A");
        System.out.println("Value of A: " + valueA);
        hashtable.remove("B");
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
        
    }
}

class sorting 
{
    int [] array=new int[] {5,2,4,9,6,3};
    void bubble()
    {
         System.out.println("bubble sort");
        int [] a=new int[]{5,2,4,9,6,3};
    
        boolean sorted = false;
        int temp;
         while(!sorted)
        {
        sorted = true;
        for (int i = 0; i < a.length - 1; i++) 
        {
            if (a[i] > a[i+1]) {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                sorted = false;
        }
    }
}

 for (int i = 0; i < a.length; i++) 
        {
           System.out.print(a[i]);
        }
        System.out.println("");
    }
    void selection()
    {
         System.out.println("SElection sort");
         for (int i = 0; i < array.length; i++) {
        int min = array[i];
        int minId = i;
        for (int j = i+1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                minId = j;
            }
        }
        // swapping
        int temp = array[i];
        array[i] = min;
        array[minId] = temp;
    }
    for (int i = 0; i < array.length; i++)
    {
        System.out.print(array[i]);
    }
    System.out.println("");
    
}
}
class searching 
{
    int[] arr =new int[] {1,6,5,8,9,2,4};
    int linear()
    {
         System.out.println("Linear Search");
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number to be serached");
        int x=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    int binary()
    {
         System.out.println("binary search");
        Scanner sc=new Scanner(System.in);
        int start = 0;
        int end = arr.length - 1;
        System.out.println("Enter number to be serached");
        int x=sc.nextInt();
    
    
        boolean sorted = false;
        int temp;
         while(!sorted)
        {
        sorted = true;
        for (int i = 0; i < arr.length - 1; i++) 
        {
            if (arr[i] > arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                sorted = false;
        }
    }
}
        while (start <= end) {
            int mid = (start + end) / 2;
            if (x == arr[mid]) {
                return mid;
            }
            else if (x > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;

    }
    int recursion(int k)
    {
        if (k>0)
        {
            return k+recursion(k-1);

        }
        else
        {
         return 0;
        }


    }
   
}
class bit
{
    void bitmap()
    {
        int a=5;
        int pos=2;
        int bitmap=1<<pos;//left shift
        int newnum=(bitmap & a);
        int n=(bitmap | a);
        int r=~(bitmap);
        System.out.println(newnum);
        System.out.println(n);
        System.out.println(r);
    }
    void bitt()
    {
         int a=5;
        int pos=2;
        int bitmap=1>>pos;//rigth shift
        int newnum=(bitmap & a);
        int n=(bitmap | a);
        int r=~(bitmap);
        System.out.println(newnum);
        System.out.println(n);
        System.out.println(r);
    }
}
class S
{
    void ss()
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string: ");
        String text = sc.nextLine();
        System.out.println("Enter the pattern string: ");
        String pattern = sc.nextLine();
        for (int i = 0; i <= (text.length() - pattern.length()); i++)
        {
            if (text.substring(i, (i + pattern.length())).equalsIgnoreCase(
                    pattern))
            {
                System.out.println(pattern
                        + " is substring of main string, match found at: "
                        + ++i);
            }
        }
        sc.close();
    }
}




public class vd {
    public static void main(String args[])
    {
      trying t=new trying();
      t.array();
      t.linked();
      t.stack();
      t.queue();
      sorting d=new sorting();
      d.bubble();
      d.selection();
      searching s=new searching();
      int y=s.linear();
      System.out.println(y);
      int z=s.binary();
      System.out.println(z);
      
      int g=s.recursion(10);
      System.out.println(g);

      bit b=new bit();
      b.bitmap();
      b.bitt();
      S v=new S();
      v.ss();




    }
    
}

