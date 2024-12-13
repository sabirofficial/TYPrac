package com.typractical;

import javax.swing.*;
import java.io.File;

public class filechooser {

    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showSaveDialog(null);  
    }
}