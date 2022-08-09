package DBMS;
import java.sql.*;
import java.util.*;

public class UpdateDb {
	UpdateDb() throws Exception,SQLException{
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
		
		System.out.print("connected\n");
		
		String q="update inserttbl set Name=?, City=? where id=?";
		
		System.out.print("Enter new name to update: ");
		String n = sc.nextLine();
		System.out.print("Enter new city name to update: ");
		String c = sc.nextLine();
		System.out.print("Enter previous id to update it's content: ");
		int id = sc.nextInt();
		
		
		PreparedStatement ps = conn.prepareStatement(q);
		System.out.print("ps created ");
	
		ps.setString(1, n);
		ps.setString(2, c);
		ps.setInt(3, id);
		
		ps.executeUpdate();
		
		System.out.print("updated");
		
		conn.close();
		
	}
	public static void main(String[] arg) {
		try {
			UpdateDb up = new UpdateDb();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
