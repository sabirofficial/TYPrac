package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class prepaidStatmentInsert {
	
	public prepaidStatmentInsert() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String pass="MineMysql8767";
		try {
			Connection con =DriverManager.getConnection(url,user,pass);
			String query="insert into emp (eid,ename,eage) values(?,?,?)";
			
			PreparedStatement  pst=con.prepareStatement(query);
			Scanner sc = new Scanner(System.in); 
			
			System.out.println("enter te id");
			int sid=sc.nextInt();
			 
			System.out.println("enter the name");
			String name=sc.next();
			
			System.out.println("enter the age");
			int age =sc.nextInt();
			
			pst.setInt(1,sid);
			pst.setString(2,name);
			pst.setInt(3, age);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

	public static void main(String[] args) {
	prepaidStatmentInsert ps=new prepaidStatmentInsert();
}
}