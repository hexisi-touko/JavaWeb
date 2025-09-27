package com.learn_java.oop_primary.character_game;

import java.util.Random;

public class Character {
    private String name;
    private int blood;
    private String gender;
    private String face;

    Random random = new Random();
    int index = random.nextInt(3);
    String[] boyFaces = {"气宇轩昂","相貌平平","五官端正","一塌糊涂"};
    String[] girlFaces = {"沉鱼落雁","相貌平平","亭亭玉立","惨不忍睹"};

    public Character() {
    }

    public Character(String name, int blood, String gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }
}
