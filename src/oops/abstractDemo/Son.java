package oops.abstractDemo;

public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    // all abstract method should be implemented in its subclass
    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Captain America");
    }
}
