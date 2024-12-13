package com.typractical.layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class layoutCombine extends JFrame {

    public layoutCombine() {
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // border layout
        BorderLayout br = new BorderLayout();
        setLayout(br);
        // panel adding 
        JPanel NORTHPanel = new JPanel();     ///north panel
        NORTHPanel.setBackground(Color.RED); 
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        NORTHPanel.setLayout(fl);
        
     // adding into north pannel as flowlayout
        JButton northbtn1 = new JButton("northbtn1");
        NORTHPanel.add(northbtn1);

        // -------------------
        JPanel southPanel = new JPanel();     //south panel
        southPanel.setBackground(Color.GREEN);
        
        // adding into South pannel
        
        GridBagLayout gbl = new GridBagLayout();
        southPanel.setLayout(gbl);
        GridBagConstraints constraints1 = new GridBagConstraints();
        GridBagConstraints constraints2 = new GridBagConstraints();
        JButton southcardbtn1 = new JButton("southcardbtn1");
        constraints1.gridx = 0;
        constraints1.gridy = 0;
        JButton southcardbtn2 = new JButton("southcardbtn2");
        constraints2.gridx = 1;
        constraints2.gridy = 1;

        southPanel.add(southcardbtn1, constraints1);
        southPanel.add(southcardbtn2, constraints2);

        
        // ------------------
        JPanel eastPanel = new JPanel();      //east panel
        eastPanel.setBackground(Color.BLUE);
        CardLayout crd = new CardLayout();
        eastPanel.setLayout(crd);
        crd.next(eastPanel);
        // adding into east pannel as CardLayout
        JButton eastcardbtn1 = new JButton("eastcardbtn1");
        JButton eastcardbtn2 = new JButton("eastcardbtn2");
        eastPanel.add(eastcardbtn1);
        eastPanel.add(eastcardbtn2);
        // ---------------------
        JPanel westPanel = new JPanel();      //west panel
        westPanel.setBackground(Color.YELLOW);
        GridLayout gl = new GridLayout(2, 2);
        westPanel.setLayout(gl);
        
        
        
        // adding into te west panel
        JButton westcardbtn1 = new JButton("westcardbtn1");
        JButton westcardbtn2 = new JButton("westcardbtn2");
        JButton westcardbtn3 = new JButton("westcardbtn3");
        JButton westcardbtn4 = new JButton("westcardbtn4");
        westPanel.add(westcardbtn1);
        westPanel.add(westcardbtn2);
        westPanel.add(westcardbtn3);
        westPanel.add(westcardbtn4);
        
        
        // -----------------------
        JPanel centerPanel = new JPanel();     //center panel
        centerPanel.setBackground(Color.CYAN);        
        
        // adding panel 
        add(NORTHPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
        add(eastPanel, BorderLayout.EAST);
        add(westPanel, BorderLayout.WEST);
        add(centerPanel, BorderLayout.CENTER);
       

        setVisible(true);
    }

    public static void main(String[] args) {
        layoutCombine fl = new layoutCombine();
    }

}