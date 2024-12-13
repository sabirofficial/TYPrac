package com.typractical;

import javax.swing.*;

public class jprogressBar {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JProgressBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);

        // Simulate a long-running task
        for (int i = 0; i <= 50; i++) {
           
            progressBar.setValue(i); 
        }
        JPanel pn=new JPanel();
        frame.add(pn);
        pn.add(progressBar);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}