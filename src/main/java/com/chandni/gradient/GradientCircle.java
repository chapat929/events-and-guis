package com.chandni.gradient;

import javax.swing.*;
import java.awt.*;

public class GradientCircle extends JPanel {
    @Override
    public void paintComponent(Graphics graphics) {
        final Graphics2D graphics2D = (Graphics2D) graphics;

        final int xCoordinatePoint1 = 70;
        final int yCoordinatePoint1 = 70;
        final Color colorPoint1 = getRandomColor();

        final int xCoordinatePoint2 = 150;
        final int yCoordinatePoint2 = 150;
        final Color endColor = getRandomColor();

        final GradientPaint gradient = new GradientPaint(xCoordinatePoint1, yCoordinatePoint1, colorPoint1, xCoordinatePoint2, yCoordinatePoint2, endColor);
        graphics2D.setPaint(gradient);
        graphics2D.fillOval(70,70,100,100);

    }

    private Color getRandomColor() {
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);

        return new Color(red, green, blue);
    }
}
