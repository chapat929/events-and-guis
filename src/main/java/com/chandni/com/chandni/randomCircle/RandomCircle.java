package com.chandni.com.chandni.randomCircle;

import javax.swing.*;
import java.awt.*;


public class RandomCircle extends JPanel {

    @Override
    public void paintComponent(Graphics graphics) {
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);

        graphics.setColor(new Color(red, green, blue));
        final int leftPadding = 70;
        final int topPadding = 70;
        final int width = 100;
        final int height = 100;
        graphics.fillOval(leftPadding, topPadding, width, height);


    }
}
