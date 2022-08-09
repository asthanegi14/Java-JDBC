package DBMS;
import java.sql.*;
import java.io.*;

public class InsertImg {
	InsertImg() throws Exception,SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
		System.out.println("Connection created");
		
		//creating table
//		String s = "create table imageinsert(id int primary key auto_increment, picture blob)";
//		
//		Statement stmt = conn.createStatement();
//		
//		stmt.executeUpdate(s);
//		
//		System.out.println("Table created");
//		
		//inserting image
		String q = "insert into imageinsert(picture) values(?)";
		
		PreparedStatement ps = conn.prepareStatement(q);
		System.out.println("PreparedStatement created");
		try {
		InputStream f = new FileInputStream("E:\\images\\Aot.jpg");
		ps.setBinaryStream(1,f,f.available());
		
		ps.executeUpdate();

		System.out.print("Image Inserted ");
		}
		catch(Exception e) {
			System.out.print("Error");
		}
		
		conn.close();
	}
	public static void main(String[] arg) {
		try {
			InsertImg im = new InsertImg();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
