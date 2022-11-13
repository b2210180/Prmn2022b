package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> word = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println(i+1 + "つ目の整数を入力してください:");
            String number = scanner.next();
            int a = Integer.parseInt(number);
            word.add(a);
        }
        int ans = word.get(0)+ word.get(1);
        System.out.println(word.get(0)+ " + " + word.get(1) + " = " + ans);
    }
}

