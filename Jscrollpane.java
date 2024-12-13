package com.typractical;

import java.awt.FlowLayout;

import javax.swing.*;

public class Jscrollpane {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JScrollPane Example");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a JTextArea with some sample text
        JTextArea textArea = new JTextArea(10,20);
       

        // Create a JScrollPane to wrap the JTextArea
        JScrollPane scrollPane = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        // Set the bounds for the scroll pane
        scrollPane.setBounds(20, 20, 200, 200);

        // Add the scroll pane to the frame
        frame.add(scrollPane);

        // Make the frame visible
        frame.setVisible(true);
    }
}
