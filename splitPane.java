package com.typractical;

import java.awt.Color;

import javax.swing.*;

public class splitPane {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JSplitPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components for each pane
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.RED);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.BLUE);

        // Create JSplitPane with horizontal split
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
//        splitPane.setTopComponent(leftPanel);
        splitPane.setBottomComponent(rightPanel);
        splitPane.setOneTouchExpandable(true);
        // Set initial divider location (optional)
        splitPane.setDividerLocation(200); 

        // Add splitPane to the frame
        frame.add(splitPane);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}