package DBMS;
import java.util.*;
import java.sql.*;

public class InsertDb {
	InsertDb() throws Exception, SQLException{
		
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
		
		//create query 
		String q = "insert into inserttbl(Name,City) values(?,?)";
		
		
		//get prepared statement object
		PreparedStatement ps = conn.prepareStatement(q);
		
		
		//set values into query
		System.out.println("Enter name to insert");
		String n = sc.nextLine();

		System.out.println("Enter city name to insert");
		String c = sc.nextLine();
		ps.setString(1, n);
		ps.setString(2, c);
		
		ps.executeUpdate();
		
		System.out.println("Values inserted");
		conn.close();
	}
	public static void main(String[] arg) {
		try {
			InsertDb in = new InsertDb();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
