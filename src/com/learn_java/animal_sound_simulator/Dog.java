package com.learn_java.animal_sound_simulator;

public class Dog extends Animal {


    public Dog(String name, String species) {
        super(name, species);
    }

    @Override
    void cry() {
        System.out.println("小狗 汪汪叫");
    }

    @Override
    void getAnimalName() {
        System.out.print(getName());
    }
}
