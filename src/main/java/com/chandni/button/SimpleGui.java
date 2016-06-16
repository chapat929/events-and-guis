package com.chandni.button;

import javax.swing.*;

public class SimpleGui {

    public void go() {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        final JButton button = new JButton();
        button.setText("Click Me");
        frame.getContentPane().add(button);

        frame.setVisible(true);
    }
}
