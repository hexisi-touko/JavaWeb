package com.learn_java.collection_sort;

import java.util.ArrayList;
import java.util.Collections; // 注意导入的是Collections而不是Collection
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) { // 需要主方法作为程序入口

        ArrayList<A> arrayList = new ArrayList<>();
        A a01 = new A(1);
        A a02 = new A(2);
        A a03 = new A(3);

        // 先将元素添加到集合中
        arrayList.add(a01);
        arrayList.add(a02);
        arrayList.add(a03);

        // 使用Collections工具类的sort方法
        Collections.sort(arrayList);

    }
}

class A implements Comparable<A> {
    private int number;

    public A(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(A o) {
        // 修正比较逻辑，返回有意义的比较结果
        return Integer.compare(this.number, o.number);
    }
}
class B <T>{
    Map<Object, T> map = new HashMap<>();

}