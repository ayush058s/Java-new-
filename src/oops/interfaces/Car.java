package oops.interfaces;

public class Car implements Brake, Engine {

    // by using interfaces we can implement more than one class
    @Override
    public void brake() {
        System.out.println("Brake is braking");
    }

    @Override
    public void start() {
        System.out.println("Start function is working properly");
    }

    @Override
    public void stop() {
        System.out.println("Stop function is working properly");
    }

    @Override
    public void acc() {
        System.out.println("Acc function is working properly");
    }
}
