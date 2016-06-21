package com.chandni.com.chandni.randomCircle;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        frame.getContentPane().add(new RandomCircle());

        frame.setVisible(true);
    }
}
