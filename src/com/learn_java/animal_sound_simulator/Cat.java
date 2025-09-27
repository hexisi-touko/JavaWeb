package com.learn_java.animal_sound_simulator;

public class Cat extends Animal {
    public Cat(String name, String species) {
        super(name, species);
    }

    @Override
    void cry() {
        System.out.println("小猫 喵喵叫");
    }

    @Override
    void getAnimalName() {
        System.out.print(getName());
    }
}
