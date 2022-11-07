package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation gas = new GasStation();
        Tire[] tires = new Tire[4];
        Engine engine = new Engine();

        gas.refuel(car);
        engine.startEngine();
        car.run();
    }
}
