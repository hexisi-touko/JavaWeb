package com.learn_java.homework05;

public class Test {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 3000);
        Peasant peasant = new Peasant("peasant", 3000);
        Teacher smith = new Teacher("smith", 4000, 4);
        Scientist jerry = new Scientist("jerry", 5000, 5000);
        Waiter waiter = new Waiter("小张", 3000);
        tom.printAnnualSalary();
        smith.printAnnualSalary();
        jerry.printAnnualSalary();
        waiter.printAnnualSalary();
    }
}
