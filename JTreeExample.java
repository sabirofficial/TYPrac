package com.typractical;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class JTreeExample {

    public static void main(String[] args) {
        // Create a root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create child nodes
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");

        DefaultMutableTreeNode smallN1 = new DefaultMutableTreeNode("Node 1.1");
        DefaultMutableTreeNode smallN2 = new DefaultMutableTreeNode("Node 2.1");
        // Add child nodes to the root
        root.add(node1);
        root.add(node2);
        node1.add(smallN1);
        node2.add(smallN2);

        // Create a TreeModel
        DefaultTreeModel treeModel = new DefaultTreeModel(root);
        
        // Create a JTree
        JTree tree = new JTree(treeModel);
        

        // Create a JFrame and add the tree
        JFrame frame = new JFrame("JTree Example");
        frame.add(new JScrollPane(tree)); 
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}