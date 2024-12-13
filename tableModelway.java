package com.typractical;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class tableModelway {
    public static void main(String[] args) {
        // Sample data
    	   String[][] data = {
    	            {"Soham", "34", "976"},
    	            {"John", "37", "479"},
    	            {"Alice", "43", "447"}
        };
    	   String[] columnNames = {"Name", "Age", "SeatNumber"};

        // Create a DefaultTableModel
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create a JTable
        JTable table = new JTable(model);

        // Create a JFrame and add the table
        JFrame frame = new JFrame("JTable Example");
        frame.add(new JScrollPane(table)); // Use JScrollPane for better scrolling
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}