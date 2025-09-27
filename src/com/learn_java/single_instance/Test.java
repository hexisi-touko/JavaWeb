package com.learn_java.single_instance;

/**
 * 这是单例模式的两种方法，
 * 其中饿汉式在类的加载时就会创建对对象，有时会造成资源浪费
 * 懒汉式在使用getInstance（）方法时，才会创建对象，但是有线程风险
 * */

public class Test {
    public static void main(String[] args) {
        System.out.println(Cat.getCat("小飞"));
    }


}
class Cat {
    //懒汉式
    private String name;
    private static Cat cat;
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public static Cat getCat(String name) {
        if(cat == null) {
            cat = new Cat(name);
            return cat;
        }else return cat;

    }

}

//class Cat {
//    //饿汉式
//    private String name;
//    private static Cat cat = new Cat("小飞");
//
//    private Cat(String name) {
//        this.name = name;
//    }
//
//    public static Cat getCat() {
//        return cat;
//    }
//
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//}