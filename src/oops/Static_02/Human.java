package oops.Static_02;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    // we can use static variable without creating an object
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
