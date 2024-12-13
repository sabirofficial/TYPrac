package com.typractical;

import javax.swing.*;
import java.util.Arrays;

public class jlisteg1 {
    public static void main(String[] args) {
        // Create a sample data array
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
        
        // Create a JList
        JList<String> list = new JList<>(items);
        
        // Create a JFrame and add the list
        JFrame frame = new JFrame("JList Example");
        JPanel pn=new JPanel();
        frame.add(pn);
        pn.add(new JScrollPane(list)); // Use JScrollPane for better scrolling
        
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}