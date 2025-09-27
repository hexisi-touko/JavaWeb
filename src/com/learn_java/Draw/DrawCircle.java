package com.learn_java.Draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {
    private MyPanel panel;
    public static void main(String[] args) {
        new DrawCircle(new MyPanel());
    }
    public DrawCircle(MyPanel panel) {
        this.panel = panel;
        this.add(panel);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
    }

}
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(100, 100, 200, 200);
    }
}