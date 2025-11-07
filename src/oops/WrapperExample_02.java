package oops;

public class WrapperExample_02 {
    public static void main(String[] args) {
        int a = 10; // it is just a primitive datatype that is stored in stack
        Integer num = 20; // it creates an object num and stores in a heap memory

        // final makes primitive data type immutable
        final int b = 11;
        // b = 22;


        // But for an object we can change it
        final A kunal = new A("Kunal kushwaha");
        kunal.name = "ayush";

        // But we can not reassign a non primitive
        // kunal = new A("new object");

        A obj;

        for(int i = 0; i < 1000000; i++){
            obj = new A("Random name");
        }

    }
}
class A{
    String name;

    public A(String name) {
        this.name = name;
    }

    //  in c++ we can destroy an object
    // in java we cannot destroy an abject inn java that is handled automatically(by garbage collector),
    // but we can tell what to do after object is destroyed
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
