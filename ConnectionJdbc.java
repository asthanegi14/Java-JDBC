package DBMS;
import java.util.*;
import java.sql.*;

public class ConnectionJdbc {
	ConnectionJdbc() throws Exception, SQLException{
		//Step 1: Set Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2: Create connection to the database
		Connection conn = DriverManager.getConnection("jdbc: mysql://localhost:3306/employeedb","root",""); // "jdbc:mysql://IP Address/DataBase_Name","User_Name","Password"

		if(conn.isClosed()) {
			System.out.println("Connection is closed");
		}
		else {
			System.out.println("Connected");
		}
	}
	public static void main(String[] arg) {
		try {
			System.out.println("Connected");
			ConnectionJdbc jb = new ConnectionJdbc();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
