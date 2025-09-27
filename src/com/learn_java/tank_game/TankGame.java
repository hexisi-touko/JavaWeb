package com.learn_java.tank_game;

import javax.swing.*;

public class TankGame extends JFrame {
    MyPanel myPanel;
    public static void main(String[] args) {
        new TankGame();
    }
    public TankGame() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setTitle("Tank Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,750);
        setVisible(true);
        addKeyListener(myPanel);
    }

}
