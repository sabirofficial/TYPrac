package com.typractical;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

public class combineAdvanceComponent {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JSplitPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components for each pane
        JPanel leftPanel = new JPanel();

        // Create JTextArea with scroll pane
        JTextArea textArea = new JTextArea(4, 10);
//        textArea.setLineWrap(true); 
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        leftPanel.add(scrollPane);
        JProgressBar progressBar = new JProgressBar(0, 100); // Set minimum and maximum values
        progressBar.setStringPainted(true); // Show progress percentage as text
        progressBar.setValue(50);
        leftPanel.add(progressBar, BorderLayout.SOUTH); // Add progress bar to south

        JButton openDialogButton = new JButton("Open Dialog");
        leftPanel.add(openDialogButton, BorderLayout.SOUTH); // Add button below progress bar
        
        JDialog dialog = new JDialog(frame, "Custom Dialog", false); // Set modal for blocking interaction with main window
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // Dispose dialog on close

       

        
        // Add action listener to open dialog on button click
        openDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 JLabel messageLabel = new JLabel("label is");
            	 int value=progressBar.getValue();
            	 messageLabel.setText(Integer.toString(value));
            	 dialog.add(messageLabel);
                dialog.setLocationRelativeTo(frame); // Center dialog relative to main frame
                dialog.setVisible(true); // Make dialog visible
                
             // Set preferred size for dialog
                dialog.pack();

            }
        });

       
        
//-------------------------------------
        JPanel rightPanel = new JPanel();

        // Create sample data for the table
        String[] columnNames = {"Color", "Tree", "Progress"};
        Object[][] data = {
                {"Row 1, Cell 1", "Row 1, Cell 2", "Row 1, Cell 3"}
        };

        // Create the table model
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

        // Create the table
        JTable table = new JTable(tableModel);

        // Add the table to a scroll pane (for better usability)
        JScrollPane tableScrollPane = new JScrollPane(table);

        // Add the table scroll pane to the right panel
        rightPanel.add(tableScrollPane);

       

        // Create DesktopPane
        JDesktopPane desktopPane = new JDesktopPane();

        // Create a button to open the DesktopPane with JTree
        JButton treeDesktopPane = new JButton("Select Tree DesktopPane");
        treeDesktopPane.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an internal frame for the DesktopPane
                JInternalFrame internalFrame = new JInternalFrame("Tree Frame",true,true,true,true);
                internalFrame.setBounds(30, 30, 200, 150);

                // Create JTree
                DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
                DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
                DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
                root.add(node1);
                root.add(node2);
                JTree tree = new JTree(root);
                tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

                JScrollPane treeScrollPane = new JScrollPane(tree); 

                // Add JTree to internal frame
                internalFrame.add(treeScrollPane);

                // Make internal frame and DesktopPane visible
                internalFrame.setVisible(true);
                desktopPane.add(internalFrame);

                // Set content pane to DesktopPane
                frame.setContentPane(desktopPane);
            }
        });

        // Create a button to open the DesktopPane with JColorChooser
        JButton colorChooserDesktopPane = new JButton("Select Color DesktopPane");
        colorChooserDesktopPane.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an internal frame for the DesktopPane
                JInternalFrame internalFrame = new JInternalFrame("Color Chooser Frame",true,true,true,true);
                internalFrame.setBounds(30, 30, 300, 200);

                // Create JColorChooser
                JColorChooser colorChooser = new JColorChooser();

                // Add JColorChooser to internal frame
                internalFrame.add(colorChooser);

                // Make internal frame and DesktopPane visible
                internalFrame.setVisible(true);
                desktopPane.add(internalFrame);

                // Set content pane to DesktopPane
                frame.setContentPane(desktopPane);
            }
        });

        // Create a button to open the DesktopPane with JFileChooser
        JButton fileChooserDesktopPane = new JButton("Select File DesktopPane");
        fileChooserDesktopPane.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an internal frame for the DesktopPane
                JInternalFrame internalFrame = new JInternalFrame("File Chooser Frame",true,true,true,true);
                internalFrame.setBounds(30, 30, 400, 300);

                // Create JFileChooser
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt")); 

                // Add JFileChooser to internal frame
                internalFrame.add(fileChooser);

                // Make internal frame and DesktopPane visible
                internalFrame.setVisible(true);
                desktopPane.add(internalFrame);

                // Set content pane to DesktopPane
                frame.setContentPane(desktopPane);
            }
        });
       
        // Create JSplitPane with horizontal split
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setTopComponent(leftPanel);
        splitPane.setBottomComponent(rightPanel);
        splitPane.setDividerLocation(200); 

        // Add all buttons to the right panel
        rightPanel.add(treeDesktopPane);
        rightPanel.add(colorChooserDesktopPane);
        rightPanel.add(fileChooserDesktopPane);

        // Add splitPane to the frame
        frame.add(splitPane);
        frame.setSize(800, 500);
        frame.setVisible(true);
    }
}