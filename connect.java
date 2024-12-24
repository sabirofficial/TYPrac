package com.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class connect {

	public connect() {
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
//			String query="create table emp(eid  int(10),ename  varchar(20),eage int(10))";
//			st.executeUpdate(query);
			String fetchquery="select * from emp";
			ResultSet  rs= st.executeQuery(fetchquery);
			while(rs.next())
			{
				int id= rs.getInt(1);
				String name=rs.getString("ename");
				int age= rs.getInt("eage");
				System.out.println(id+" "+name+" "+age);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

	public static void main(String[] args) {
		connect ld= new  connect();
	}

}
