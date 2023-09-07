package jdbc;
import java.sql.*;
import java.util.*;



public class jdbc {
    public static void main (String args[]) throws Exception
    {

		Scanner sc=new Scanner(System.in);

		String user,pass;
		
		System.out.println("Enter Username or Email ID:");
		user=sc.next();
		
		System.out.println("Enter Password:");
		pass=sc.next();
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/core","root","Welcome@123456");
        String q="insert into login(name,pass) values ('"+user+"','"+pass+"')";
		
		PreparedStatement psmt=conn.prepareStatement(q);
		
		int row =psmt.executeUpdate();
        if(row>0)
		{
			System.out.println("Save Success");
        }
        else
        {
            System.out.println("no success");
        }
        sc.close();
		
    }

    
}
