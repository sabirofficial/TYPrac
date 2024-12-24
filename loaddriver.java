package com.JDBC;

public class loaddriver {

	public loaddriver() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		System.out.print("driver Loaded");	
		
		}

	public static void main(String[] args) {
		loaddriver ld= new  loaddriver();
	}

}
