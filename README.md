# Java-JDBC <img src="https://c.tenor.com/kWH14UCHLuAAAAAi/rabbit.gif" width=90>

JDBC stands for Java Database Connectivity. JDBC is a Java API to connect and execute the query with the database. It is a part of JavaSE (Java Standard Edition). JDBC API uses JDBC drivers to connect with the database. 
<br><br>
The `java.sql` package contains classes and interfaces for JDBC API.
<br>
We can use JDBC API to handle database using Java program and can perform the following activities:
<br>
1. Connect to the database
2. Execute queries and update statements to the database
3. Retrieve the result received from the database.
4. Delete data of database.
<br>

# Java Database Connectivity with 5 Steps <img src="https://c.tenor.com/1sc0ueNUR18AAAAi/baby-yoda-star-wars.gif" width=90>

There are 5 steps to connect any java application with the database using JDBC.
<br>These steps are as follows: 
<br><br>
<img src="https://static.javatpoint.com/java/new/images/java-database-connectivity-steps.jpg">
<br><br>
**Step 1. Load the driver**
<br>
JDBC Driver is a software component that enables java application to interact with the database. The `forName()` method of Class class is used to register the driver class. This method is used to dynamically load the driver class.
<br>
` Syntax of mysql Driver: Class.forName("com.mysql.cj.jdbc.Driver"); `
<br><br>
Note : There are diffrent drivers for diffrent database
<br>

**Step 2. Create Connection**
<br>
The `getConnection()` method of DriverManager class is used to establish connection with the database.<br>
` Syntax : Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_Name","Username","password"); `
<br>
<br>

**Step 3. Create the Statement object**
<br>
The `createStatement()` method of Connection interface is used to create statement. The object of statement is responsible to execute queries with the database. <br>
`Syntax : Statement stmt=con.createStatement(); `

<br>

**Step 4. Execute the query**
<br>
The `executeQuery()` method of Statement interface is used to execute queries to the database. This method returns the object of ResultSet that can be used to get all the records of a table.
<br>

` Syntax : ResultSet rs=stmt.executeQuery("select * from emp");`
<br> `while(rs.next()){  
System.out.println(rs.getInt(1)+" "+rs.getString(2));} `

**Step 5. Close the connection object**
<br>
By closing connection object statement and ResultSet will be closed automatically. The `close()` method of Connection interface is used to close the connection.
<br>
`Syntax : conn.close();`

<h1 align="center">Thanks for reading <img src="https://c.tenor.com/y1enbfpHMTEAAAAi/hi-cute.gif" width=150></h1>
