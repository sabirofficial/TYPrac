package com.JDBC;

import java.sql.*;

public class prepaidStatmentSelect {

    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database credentials
            String url = "jdbc:mysql://localhost:3306/mydb";
            String user = "root";
            String pass = "MineMysql8767";

            // Establish a connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // Create a prepared statement
            String query = "select * from emp where eid = ?";
            PreparedStatement pst = con.prepareStatement(query);

            // Set the parameter value
            pst.setInt(1, 3);

            // Execute the query and get the result set
            ResultSet rs = pst.executeQuery();

            // Process the result set
            while (rs.next()) {
                // Retrieve data from each column
                int eid = rs.getInt("eid");
                String ename = rs.getString("ename"); 
                // ... retrieve other columns ...

                // Print or process the retrieved data
                System.out.println("Employee ID: " + eid + ", Name: " + ename); 
            }

            // Close resources
            rs.close();
            pst.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}