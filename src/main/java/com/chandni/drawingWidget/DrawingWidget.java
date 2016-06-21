package com.chandni.drawingWidget;

import javax.swing.*;
import java.awt.*;

public class DrawingWidget extends JPanel {

    @Override
    public void paintComponent(Graphics graphics) {
        graphics.setColor(Color.orange);
        graphics.fillRect(20, 50, 100, 100);
    }


}
