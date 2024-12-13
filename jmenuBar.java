package com.typractical;

import javax.swing.*;
import java.awt.event.*;

public class jmenuBar {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JMenu Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu (e.g., "File")
        JMenu fileMenu = new JMenu("File");

        // Create JMenuItems (e.g., "New", "Open", "Exit")
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

      
       
        // Add menu items to the menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator(); // Add a separator line
        fileMenu.add(exitItem);

        // Add the menu to the menu bar
        menuBar.add(fileMenu);

        // Add the menu bar to the frame
        frame.setJMenuBar(menuBar);

        // Make the frame visible
        frame.setVisible(true);
    }
}
