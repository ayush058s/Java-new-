package oops.access;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }
    A obj = new A(33, "ayush");
    String namee = obj.name;

    public static void main(String[] args) {
        SubClass obj = new SubClass(33, "ayush");
        System.out.println(obj.num);

    }
}
