package com.learn_java.tank_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener {
    MyTank tank;
    Vector<EnemyTank> enemies;
    public MyPanel() {
        this.tank = new MyTank(100,100);
        tank.setSpeed(10);
        enemies = new Vector<EnemyTank>();
        int enemiesSize = 3;
        for (int i = 0; i < enemiesSize; i++) {
            enemies.add(new EnemyTank((100 * (i + 1)),0));
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);
        //画坦克
        DrawTank(tank.getX() , tank.getY() , g , tank.getDirect(), 0);
        for (int i = 0; i < enemies.size(); i++) {
            EnemyTank enemyTank = enemies.get(i);
            DrawTank(enemyTank.getX(),enemyTank.getY(),g,2,1);
        }
    }
    /**坦克的坐标 x
     *      坐标 y
     *      类型 type
     * */
    public void DrawTank(int x, int y, Graphics g , int direct, int type){
        switch (type){
            case 0://myTank
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
            default:
                break;
        }
        switch (direct){
            case 0://up
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x + 10,y + 20,20,20);
                g.drawLine(x + 20,y + 30,x + 20,y );
                break;
            case 1://right
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y + 30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x + 20,y + 10,20,20);
                g.drawLine(x + 30,y + 20,x + 60,y + 20);
                break;
            case 2://down
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x + 10,y + 20,20,20);
                g.drawLine(x + 20,y + 30 ,x + 20,y + 60);
                break;
            case 3://left
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y + 30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x + 20,y + 10,20,20);
                g.drawLine(x + 30,y + 20,x ,y + 20);
                break;
            default:
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W){
            tank.setDirect(0);
            tank.moveUP();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            tank.setDirect(1);
            tank.moveRIGHT();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            tank.setDirect(2);
            tank.moveDOWN();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            tank.setDirect(3);
            tank.moveLEFT();
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
