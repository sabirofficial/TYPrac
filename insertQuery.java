package com.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.protocol.Resultset;

public class insertQuery {

	public insertQuery() {
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
//			String query="insert into emp(eid,ename,eage) values(101,'harsh',24)";
//			System.out.print(st.executeUpdate(query)); 
			
//			String query="update  emp set ename='harshjain' where ename='harsh'";
//			st.execute(query);
			
			String query="delete from emp where ename='harshjain'";
			st.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

	public static void main(String[] args) {
		insertQuery ld= new  insertQuery();
	}

}


