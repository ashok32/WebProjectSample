package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJdbcApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		 String driverClassName="oracle.jdbc.driver.OracleDriver";
		 String url="jdbc:oracle:thin:@localhost:1521:xe";
		 String username="SYSTEM";
		 String password="dev123";
		 
		 String query="insert into customers(id,firstname, lastname,dob,location,address,price)values(?, ? ,?,?,?,?,?)";
		 Class.forName(driverClassName);
		 Connection conn=DriverManager.getConnection(url, username, password);
//		 Statement st =conn.createStatement(query);
//		 System.out.println(conn);
//		st.executeQuery(query);
//		ResultSet rs=st.executeQuery(query);
//		while(rs.next())
//		{
//			System.out.println(rs.getString("customers"));
//		}
//		 
//		rs.close();
//		st.close();
//		conn.close();
//		 
		PreparedStatement pst =conn.prepareStatement(query);
		pst.setInt(1, 1234);
		pst.setString(2, "shiva");
		pst.setString(3, "rama");
		pst.setInt(4, 05);
		pst.setString(5, "MN");
		pst.setString(6, "eagan");
		pst.setInt(7, 5000);
		pst.executeUpdate();
		int i=pst.executeUpdate();
		System.out.println(i);
		pst.close();
		
	}

}
