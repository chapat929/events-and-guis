package com.chandni.button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui implements ActionListener {

    private static int clickCount = 0;

    private final JButton button = new JButton();

    public void go() {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        button.setText("Click Me");
        frame.getContentPane().add(button);
        button.addActionListener(this);

        //This must be after the button is added to the content pane
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        clickCount++;
        button.setText("I've been clicked " + clickCount);
    }
}
