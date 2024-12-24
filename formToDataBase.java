package com.JDBC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class formToDataBase extends JFrame implements ActionListener {

    private JTextField idField, nameField;
    private JButton submitButton;

    public formToDataBase() {
        // Set up the GUI
        setTitle("Database Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create JTextFields
        idField = new JTextField(10);
        nameField = new JTextField(20);

        // Create and add labels
        JLabel idLabel = new JLabel("ID:");
        JLabel nameLabel = new JLabel("Name:");
        add(idLabel);
        add(idField);
        add(nameLabel);
        add(nameField);

        // Create and add submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this); 
        add(submitButton);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            try {
                // Replace with your actual database credentials
            	String url="jdbc:mysql://localhost:3306/myDB";
        		String user="root";
        		String pass="MineMysql8767";
                // Load the JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish a connection
                Connection connection = DriverManager.getConnection(url, user, pass);

                // Get values from JTextFields
                String id = idField.getText();
                String name = nameField.getText();

                // Create and execute SQL INSERT statement
                String sql = "INSERT INTO formSubmit (id, name) VALUES (?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, id);
                statement.setString(2, name);
                int rowsInserted  = statement.executeUpdate();

                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data inserted successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to insert data.", "Error", JOptionPane.ERROR_MESSAGE);
                }

                // Close resources
                statement.close();
                connection.close();

            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
    	formToDataBase fdt=new formToDataBase();
       
    }
}