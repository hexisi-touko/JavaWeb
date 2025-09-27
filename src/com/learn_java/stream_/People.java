package com.learn_java.stream_;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class People {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("zhangsan,23");
        strings.add("lisi,24");
        strings.add("wangwu,25");
//        Map<String, String> collect = strings.stream()
//                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24).
//                collect(Collectors.toMap(new Function<String, String>() {
//                    @Override
//                    public String apply(String s) {
//                        return s.split(",")[0];
//                    }
//                }, new Function<String, String>() {
//                    @Override
//                    public String apply(String s) {
//                        return s.split(",")[1];
//                    }
//                }));
        Map<String, String> collect = strings.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24).
                collect(Collectors.toMap(
                        s-> s.split(",")[0]
                        , s -> s.split(",")[1]
                ));

        System.out.println(collect);

    }

}
