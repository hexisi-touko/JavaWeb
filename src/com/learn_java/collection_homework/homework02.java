package com.learn_java.collection_homework;

import java.util.ArrayList;
import java.util.Iterator;

public class homework02 {
    public static void main(String[] args) {

        Car car = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);

        ArrayList arrayList = new ArrayList();
        arrayList.add(car);
        System.out.println("arrayList: " + arrayList);
        arrayList.add(car2);
        System.out.println("arrayList: " + arrayList);

//        arrayList.remove(car);
//        System.out.println("arrayList: " + arrayList);
//        arrayList.contains(car);
//        System.out.println("arrayList: " + arrayList);
//        System.out.println("size: " + arrayList.size());
//        System.out.println("isEmpty: " + arrayList.isEmpty());
//        arrayList.clear();
//        System.out.println("arrayList: " + arrayList);
//        ArrayList arrayList2 = new ArrayList();
//        arrayList2.add(car);
//        arrayList.addAll(arrayList2);
//        System.out.println("arrayList: " + arrayList);
//        arrayList.containsAll(arrayList2);
//        System.out.println("arrayList: " + arrayList);
//        arrayList.removeAll(arrayList2);
//        System.out.println("arrayList: " + arrayList);

        System.out.println("===================");
        for (Object cars  : arrayList) {
            System.out.println("cars: " + cars);
        }

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Car car1 = (Car) iterator.next();
            System.out.println(car1);
        }




    }
}
class Car{
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}