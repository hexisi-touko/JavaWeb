package com.learn_java.interface_;

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        EatDog eatDog = new EatDog();
        CryDog cryDog = new CryDog();
        dog.show(eatDog);
        dog.show(cryDog);
    }
}
