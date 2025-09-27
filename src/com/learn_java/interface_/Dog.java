package com.learn_java.interface_;

public class Dog {
    DogState state;

    public void show(DogState state) {
        state.showState();
    }


    public DogState getState() {
        return state;
    }

    public void setState(DogState state) {
        this.state = state;
    }
}
