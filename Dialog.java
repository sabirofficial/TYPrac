package com.typractical;

import java.awt.FlowLayout;

import javax.swing.*;

public class Dialog {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton showDialogButton = new JButton("Show Modal Dialog");
        showDialogButton.addActionListener(e -> {
            // Create a modal dialog with the specified owner, title, and modality (true for modal)
            JDialog dialog = new JDialog(frame, "My Modal Dialog", true); 
            dialog.setSize(300, 150);
            dialog.setLocationRelativeTo(frame); 
            dialog.setVisible(true);
        });
        frame.setLayout(new  FlowLayout());
        frame.add(showDialogButton);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}