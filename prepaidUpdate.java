package com.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.protocol.Resultset;

public class prepaidUpdate {

	public prepaidUpdate() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		System.out.print("driver Loaded");
		String url="jdbc:mysql://localhost:3306/myDB";
		String user="root";
		String pass="MineMysql8767";
		try {
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
//			
			String query="update  emp set eid=? where eid=?";
			PreparedStatement  pst= con.prepareStatement(query);
			pst.setInt(1, 2000);
			pst.setInt(2, 1000);
			
			int status=pst.executeUpdate();
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

	public static void main(String[] args) {
		prepaidUpdate ld= new  prepaidUpdate();
	}

}
