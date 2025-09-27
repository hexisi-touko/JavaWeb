package com.learn_java.interface_;

public class EatDog implements DogState{
    @Override
    public void showState() {
        System.out.println("dog is eating");
    }
}
