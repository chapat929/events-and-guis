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

        for (int steps = 0; steps < 200; steps++) {
            x = x + 1;
            y = y + 1;

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }

            movingCircle.repaint();
        }
    }

    private class MovingCircle extends JPanel {

        @Override
        public void paintComponent(Graphics graphics) {
            graphics.setColor(Color.white);
            graphics.fillRect(0,0,this.getWidth(),this.getHeight());
            graphics.setColor(Color.BLUE);
            graphics.fillOval(x, y, 30, 30);
        }
    }
}
