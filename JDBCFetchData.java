package DBMS;

import java.util.*;
import java.sql.*;

public class JDBCFetchData {
	JDBCFetchData() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");// Step 1: Loading driver of whatever database you are using
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root",""); // Step 2: Creating connection to that database
		System.out.print("Enter dno: ");
		int endno = sc.nextInt();
		Statement stmt = conn.createStatement(); //Step 3: Create Statement
		ResultSet rs = stmt.executeQuery("SELECT * FROM pers WHERE dno =  " + endno);

		while (rs.next()) { // Step 4: Process the data
			System.out.print("\nempcode is: \t\t" + rs.getString("empcode"));
			System.out.print("\nempname is: \t\t" + rs.getString("empname"));
			System.out.print("\ndesignation is: \t" + rs.getString("designation"));
			System.out.print("\ndno is: \t\t" + rs.getInt("dno"));
		}
		conn.close(); // Step 5: close the connection
	}

	public static void main(String[] arg) {
		try {
			JDBCFetchData jd = new JDBCFetchData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
