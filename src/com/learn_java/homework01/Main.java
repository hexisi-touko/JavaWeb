package com.learn_java.homework01;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("jack",18,"student");
        people[1] = new Person("tom",29,"teacher");
        people[2] = new Person("jane",20,"worker");
        Person.bubblesSort(people);
        Person.printPersons(people);
    }
}
