package com.chandni.twoButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private JFrame frame;
    private JLabel label;
    private static int count = 0;

    public static void main(String[] args) {
        final Main main = new Main();
        main.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        final JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        final JButton colorButton = new JButton("Change Color");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("I'm a label");
        final MyDrawingPanel myDrawingPanel = new MyDrawingPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, myDrawingPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setVisible(true);
    }

    private class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    private class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            label.setText("Ouch # " + count);
        }
    }
}
