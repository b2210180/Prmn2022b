package lecture02;

public class GasStation {
   int fuel;
    void refuel(Car car){
        car.fuel += 20;
        System.out.println("給油しました。現在の燃料は" + car.fuel + "です。");
    }
}
