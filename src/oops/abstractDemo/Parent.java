package oops.abstractDemo;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    // we can create static methods in abstract class
    // but not abstract static methods and abstract constructors
    static void hello() {
        System.out.println("hello");
    }

    //    If a class contains at least one abstract method, the class must be declared abstract.
//    An abstract method is a method without a body (only declaration, no implementation).
//    You cannot instantiate an abstract class.
    abstract void career();
    abstract void partner();
}
