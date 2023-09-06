import java.util.Scanner;
class operator
{
    public int add()
    {
        int a=22;
        int b=14;
        return(a+b);

    }
}
class first
{
    public static void main(String[] args) {
    System.out.println("Hello");
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    System.out.println("Hello "+a);
    sc.close();
    System.out.println("Abdul Rehman");
    operator o=new operator();
    double sum=o.add();
    System.out.println(sum);
    }
}