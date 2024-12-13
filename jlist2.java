package com.typractical;

import java.util.List;

import javax.swing.*;

public class jlist2 {

    public static void main(String[] args) {
        // Create a DefaultListModel
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Apple");
        listModel.addElement("Banana");
        listModel.addElement("Orange");
        listModel.addElement("Green-Apple");
        listModel.addElement("pear");
        listModel.addElement("Lemon");


        // Create a JList using the DefaultListModel
        JList<String> list = new JList<>(listModel);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Allow single selection

       

        // Create a JFrame and add the JList
        JFrame frame = new JFrame("JList with DefaultListModel");
        frame.add(new JScrollPane(list));
        frame.setSize(200, 150);
        frame.setVisible(true);
    }
}