package lecture02;

public class Car {
    int fuel;
    Tire tires[];
    Engine engine;

    void run() {
        if (fuel == 0) {
            System.out.println("燃料切れで走れません。");
        } else {
            System.out.println("燃料を１消費して走りました。");
        }
    }
}


