package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.CallableStatement;
import com.mysql.cj.protocol.Resultset;

public class procedureEg {

	public procedureEg() {
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
			CallableStatement st=con.prepareCall("call studentProcedure()");
			ResultSet  rs=st.executeQuery();
			while(rs.next())
			{
				int id= rs.getInt(1);
				String name=rs.getString(2);
				System.out.println(id+" "+name);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

	public static void main(String[] args) {
		procedureEg ld= new  procedureEg();
	}

}


