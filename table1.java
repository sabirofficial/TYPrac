package com.typractical;

import javax.swing.*;

public class table1 {
    public static void main(String[] args) {
        // Sample data
        String[][] data = {
            {"Soham", "34", "976"},
            {"John", "37", "479"},
            {"Alice", "43", "447"}
        };
        String[] columnNames = {"Name", "Age", "SeatNumber"};

        JTable  tb = new JTable (data, columnNames);


        // Create a JFrame and add the table
        JFrame frame = new JFrame("JTable Example");
        frame.add(new JScrollPane(tb)); // Use JScrollPane for better scrolling
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}