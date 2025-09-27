package com.learn_java.homework05;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

}
class Peasant extends Employee{
    public Peasant(String name, double salary) {
        super(name, salary);
    }
}
class Teacher extends Employee{
    private double remuneration;

    public Teacher(String name, double salary, double remuneration) {
        super(name, salary);
        this.remuneration = remuneration;
    }

    public double getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(double remuneration) {
        this.remuneration = remuneration;
    }
    public void printAnnualSalary() {
        System.out.println("Annual Salary: " + getSalary() * 12 + "\t课酬=" + getRemuneration() * 365);
    }
}
class Scientist extends Employee{
    private double bonus;

    public Scientist(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void printAnnualSalary() {
        System.out.println("Annual Salary: " + getSalary() * 12 + "\tBonus: " + getBonus());
    }
}
class Waiter extends Employee{
    public Waiter(String name, double salary) {
        super(name, salary);
    }
}