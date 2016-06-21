package com.chandni.imageIcon;

import javax.swing.*;
import java.awt.*;

public class Icon extends JPanel {

    @Override
    public void paintComponent(Graphics graphics) {
        Image image = new ImageIcon("/Users/chandni/personal/Google Drive/Social/IMG_6262.jpeg").getImage();
        graphics.drawImage(image, 3, 4, this);
    }
}
