package DBMS;
import java.sql.*;
public class CreateTable{
	CreateTable() throws Exception, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
		
		String s = "CREATE table InsertTbl(id int(20) primary key auto_increment, Name varchar(200) not null, City varchar(400))";
	
		Statement stmt = conn.createStatement();
		
		stmt.executeUpdate(s); //Prepared Statement || CallableStatement
		
		System.out.print("Table Created Successfully");
		conn.close();
	}
	public static void main(String[] arg) {
		try {
			System.out.println("Connected");
			CreateTable db = new CreateTable();
		}
		catch(Exception e){
			e.getStackTrace();
		}
	}
}
