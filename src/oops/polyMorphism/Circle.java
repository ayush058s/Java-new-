package oops.polyMorphism;

public class Circle extends Shapes {

    // this will run when obj of Circle is created
    // hence it is overriding the parent method
    @Override
    void area(){
        System.out.println("Area of a Circle is pi * r * r");
    }

}
