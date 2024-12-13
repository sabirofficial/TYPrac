package com.typractical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class color {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JColorChooser Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton chooseColorButton = new JButton("Choose Color");
        chooseColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(frame, "Choose a Color", Color.RED);
                frame.getContentPane().setBackground(selectedColor);           
                }
        });

        frame.add(chooseColorButton);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}