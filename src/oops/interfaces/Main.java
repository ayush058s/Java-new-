package oops.interfaces;

import oops.interfaces.NiceCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.brake();
        car.acc();
        car.start();


        NiceCar niceCar = new NiceCar();

        niceCar.startMedia();
        niceCar.start();
        niceCar.upgradeEngine();
        niceCar.stop();
    }
}
