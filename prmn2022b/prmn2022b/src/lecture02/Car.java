package lecture02;

public class Car {
    int fuel;
    Engine engine;
    Tire[] tires;

    Car(Tire[] tires, Engine engine) {
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    Car() {
        fuel = 0;
    }

    void run() {
        if (fuel <= 0) {
            System.out.println("燃料切れで走れません。");
        } else {
            fuel = fuel - 1;
            System.out.println("燃料を１消費して走りました。");
        }
    }

    void startEngine() {
        engine.start();
    }
}


