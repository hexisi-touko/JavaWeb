package com.learn_java.interface_;

public class CryDog implements DogState{

    @Override
    public void showState() {
        System.out.println("dog is crying");
    }
}
