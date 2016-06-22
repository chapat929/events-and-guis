package com.chandni.twoButtons;

import javax.swing.*;
import java.awt.*;

public class MyDrawingPanel extends JPanel {

    @Override
    public void paintComponent(Graphics graphics) {
        graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        graphics.fillOval(15,70,75,75);
    }
}
