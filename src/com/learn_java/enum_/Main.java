package com.learn_java.enum_;

public class Main {
    public static void main(String[] args) {
        System.out.println("==所有星期的信息如下==");
        Week[] weeks = Week.values();
        for (Week i : weeks) {
            System.out.println(i);
        }
    }

}
enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
    THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    private final String name;


    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}