package com.chandni.movingCircle;

import javax.swing.*;
import java.awt.*;

public class Main {

    private JFrame frame;
    private int x = 10;
    private int y = 10;

    public static void main(String[] args) throws InterruptedException {
        final Main main = new Main();
        main.go();
    }

    private void go() throws InterruptedException {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        final MovingCircle movingCircle = new MovingCircle();

        frame.getContentPane().add(movingCircle);

        frame.setVisible(true);

        Thread.sleep(3000l);
        x = 200;
        y = 200;
        frame.repaint();
    }

    private class MovingCircle extends JPanel {

        @Override
        public void paintComponent(Graphics graphics) {
            graphics.setColor(Color.BLACK);
            graphics.fillOval(x, y, 30, 30);
        }
    }
}
