package oops;

public class Oops_01 {

    //A class in Java is a blueprint or template from which objects are created.
    //It defines the attributes (data/fields) and behaviors (methods) that the created objects will have.
    // an object ia an instance of class => physical reality

    // state of an object
    // identity of an object
    // behaviour of an object

    public static void main(String[] args) {
        Students ayush;           // declaring reference to object, compile time
        ayush = new Students();   // dynamically allocates(runtime) memory and returns a reference to it and stored in heap

        ayush.roll = 12;
        ayush.name = "Ayush Singh";

        ayush.greeting();

        Students rahul = new Students();


        // instance variables: variables inside the object}
    }
}
class Students{

    int roll;
    String name;
    float marks = 99;



    void greeting(){
        System.out.println("My name is ayush" + name);
    }

    Students () {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    Students(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}
