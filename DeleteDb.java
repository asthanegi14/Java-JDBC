package DBMS;
import java.sql.*;
import java.util.*;
public class DeleteDb {
	DeleteDb() throws Exception,SQLException{
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
		System.out.println("connected");
		String s = "delete from inserttbl where id=?";

		System.out.println("Enter id to delete it's data");
		int id = sc.nextInt();
		sc.close();
		PreparedStatement ps = conn.prepareStatement(s);
		
		ps.setInt(1, id);
		
		ps.executeUpdate();

		System.out.print("deleted");
		
		conn.close();
	}
	public static void main(String[] arg) {
		try {
			new DeleteDb();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
