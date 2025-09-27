package com.learn_java.homework03;

public class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
        return super.introduce();
    }
}
class AsProfessor extends Teacher{
    public AsProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
}
class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
}