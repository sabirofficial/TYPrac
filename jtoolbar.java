package com.typractical;

import javax.swing.*;
import java.awt.event.*;

public class jtoolbar {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JToolBar Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create a JToolBar
        JToolBar toolBar = new JToolBar("Toolbar");

        // Add buttons to the toolbar
        JButton newButton = new JButton("New");
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");
        JButton saveAsButton = new JButton("SaveAs");

        // Add ActionListener to "New" using an anonymous class
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("New clicked");
            }
        });

        // Add ActionListener to "Open" using an anonymous class
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Open clicked");
            }
        });

        // Add ActionListener to "Save" using an anonymous class
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save clicked");
            }
        });

        // Add buttons to the toolbar
        toolBar.add(newButton);
        toolBar.add(openButton);
        toolBar.add(saveButton);
        toolBar.add(saveAsButton);

        // Add a separator to the toolbar
        toolBar.addSeparator();
      

        // Add another button
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Close the application
            }
        });
        toolBar.add(exitButton);

      
        toolBar.setBounds(0, 0, 400, 40); 
        frame.add(toolBar);

        // Set frame visible
        frame.setVisible(true);
    }
}
