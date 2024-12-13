package com.typractical;

import javax.swing.*;
import java.awt.event.*;

public class jcombobox {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JComboBox Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create a JComboBox
        String[] options = {"Java", "Python", "HTML", "JavaScript"};
        JComboBox comboBox = new JComboBox(options);

        // Set position and size
        comboBox.setBounds(100, 50, 200, 30);
        comboBox.setEditable(true);
        // Add an ActionListener to handle item selection
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected =  (String) comboBox.getSelectedItem();
                System.out.println("Selected Item: " + selected);
            }
        });

        // Add the JComboBox to the frame
        frame.add(comboBox);

        // Make the frame visible
        frame.setVisible(true);
    }
}
