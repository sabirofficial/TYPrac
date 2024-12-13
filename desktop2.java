package com.typractical;

import javax.swing.*;

public class desktop2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Desktop Pane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane desktopPane = new JDesktopPane();
        frame.setContentPane(desktopPane);

        JInternalFrame internalFrame1 = new JInternalFrame("Internal Frame 1");
        internalFrame1.setBounds(30, 30, 200, 150);

        // Add a JButton to the internalFrame1
        JButton button1 = new JButton("Button 1");
        internalFrame1.add(button1); 

        internalFrame1.setVisible(true);
        desktopPane.add(internalFrame1);

        JInternalFrame internalFrame2 = new JInternalFrame("Internal Frame 2");
        internalFrame2.setBounds(250, 50, 300, 200);
        internalFrame2.setVisible(true);
        desktopPane.add(internalFrame2);

        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}