package com.learn_java.stream_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Odd {
    public static void main(String[] args) {
        ArrayList<String> odds = new ArrayList<>();
        Collections.addAll(odds,"1","2","3","4");
        List<String> collect =
                odds.stream().filter(s -> (Integer.parseInt(s) % 2) == 0)
                        .collect(Collectors.toList());
        System.out.println(collect);
    }
}
