package com.learn_java.map_;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Employee jack = new Employee("jack", 3000, 2);
        Employee mary = new Employee("mary", 18000, 3);
        Employee naruto = new Employee("naruto", 3000, 1);
        hashMap.put(jack.getId(),jack);
        hashMap.put(naruto.getId(),naruto);
        hashMap.put(mary.getId(),mary);
        //迭代器遍历
        Iterator iterator = hashMap.entrySet().iterator();//?
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Map.Entry entry = (Map.Entry) next;
            Employee employee = (Employee) entry.getValue();
            if (employee.getSalary() >= 18000) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

    }
}
