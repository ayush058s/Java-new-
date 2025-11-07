package oops.Static_02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "kunal kushwaha", 100000, false);
        Human ayush = new Human(20, "ayush singh", 50000, false);

        System.out.println(kunal.name);
        System.out.println(ayush .population);
        System.out.println(Human.population);// this is preferred to call static variable

        // only static functions are allowed in static as it requires an instance
//        greeting();
        fun();


        // you can not access non-static stuff without referencing
        // their instance in a static context
        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    // this is not dependent on objects so this will not allow non static functions too
    static void fun(){

    }

    void greeting(){
        System.out.println("Hello World");
    }
}
