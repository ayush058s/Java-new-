package oops.polyMorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();// will call circle no matter if it is referencing to shapes
        // what it is trying to access need to be defined in reference(Shapes)
        // and which one it is accessing is defined by object (overriding)

    }



    // Types
    /*
    1) Compile Time / Static PolyMorphism
         -> achieved by Method Overloading
         -> MO = same name but types, argument, return type, ordering can be different
         -> MO ex is multiple constructor
         -> checking which method to call is done at compile time that's why

    2) Run Time / Dynamic PolyMorphism
         -> achieved by Method Overriding
         -> Upcasting = which method will be called depend on object this is known as upcasting
         -> Parent obj = new Child();
         -> we can not override a method that has FINAL KEYWORD
         -> final can be used to prevent overriding and inheritance
         -> as it is done at runtime also known as late binding
                     early vs late binding
         -> static method can not be overridden
         -> Overriding depends on objects, static does not so static method can not be overridden

         * DYNAMIC DISPATCH = Java decides which version of a method to execute at runtime
            based on the actual object type, not the reference type.

     */
}
