package com.learn_java.tank_game;

public class Tank {
    private int x;
    private int y;
    private int direct;
    private int speed;
    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void moveUP() {
        this.y -= speed;
    }
    public void moveDOWN() {
        this.y += speed;
    }
    public void moveLEFT() {
        this.x -= speed;
    }
    public void moveRIGHT() {
        this.x += speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class MyTank extends Tank {
    public MyTank(int x, int y) {
        super(x, y);
    }
}
class EnemyTank extends Tank {

    public EnemyTank(int x, int y) {
        super(x, y);
    }
}