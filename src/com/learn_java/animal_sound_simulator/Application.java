package com.learn_java.animal_sound_simulator;

public class Application {
    public static void main(String[] args) {
        Simulator.playSound(new Cat("小夕","猫"));
        Simulator.playSound(new Dog("小黑","狗"));

    }
}
