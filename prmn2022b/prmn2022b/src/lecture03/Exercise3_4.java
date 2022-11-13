package lecture03;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> veget = new ArrayList<Vegetable>();

        Vegetable v1 = new Vegetable("にんじん", 117);

        Vegetable v2 = new Vegetable("玉ねぎ", 120);

        Vegetable v3 = new Vegetable("にんじん", 154);
        veget.add(v1);
        veget.add(v2);
        veget.add(v3);

        for (Vegetable xi : veget) {
            xi.print();
        }
    }
}