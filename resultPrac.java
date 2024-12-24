package com.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class resultPrac {

	public resultPrac() {
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
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
//			
			String fetchquery="select * from student";
			ResultSet  rs= st.executeQuery(fetchquery);
			
			
			rs.absolute(1);
			rs.relative(2);
			
			rs.updateInt(1, 60);
			rs.updateRow();
			while(rs.next())
			{
				int id= rs.getInt(1);
				String name=rs.getString("name");
				System.out.println(id+" "+name);
			}
//			rs.last();
//			
//			while(rs.previous())
//			{
//				int id= rs.getInt(1);
//				String name=rs.getString("name");
//				System.out.println(id+" "+name);
//			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

	public static void main(String[] args) {
		resultPrac ld= new  resultPrac();
	}

}
