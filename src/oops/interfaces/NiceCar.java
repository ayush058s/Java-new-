package oops.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMedia(){
        player.start();
    }
    public void stopMedia(){
        player.stop();
    }

    // we can set engine from power to electric
    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
