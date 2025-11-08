package oops.abstractDemo;

public class Main {
    public static void main(String[] args) {

        Son s = new Son(23);
        s.career();

        Daughter d = new Daughter(19);
        d.career();

        Parent.hello();
    }
}
