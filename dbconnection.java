	import java.sql.*;
	import java.io.*;
System.out.println("ok i got it ");

     class dbconnection
      {
	public static void main(String args[])
		{  
		try
		{  
		//step1 load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1522:xe","system","oracle");
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery("select *from venkat");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"  "+rs.getString(2));
		}
		System.out.println("connection ok");
        }
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("not connected");
		}


}}
