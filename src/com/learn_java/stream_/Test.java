package com.learn_java.stream_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> actors = new ArrayList<>();
        ArrayList<String> actress = new ArrayList<>();
        Collections.addAll(actors,"张老三,23","李四,25","王老五,25");
        Collections.addAll(actress,"杨幂,23","杨颖,25","王老五,25");
        Stream<String> stream1 = actors.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);
        Stream<String> stream2 = actress.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);
        List<Actor> collect = Stream.concat(stream1, stream2).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                return new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]));
            }
        }).collect(Collectors.toList());
        System.out.println(collect);

    }
}
