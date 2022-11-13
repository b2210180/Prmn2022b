package lecture03;

import java.util.Scanner;
import java.util.ArrayList;
public class Exercise3_2 {
    public static void main(String[] args) {
        System.out.print("何行分入力しますか？:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<String> lists = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println(i+1 + "行目>");
            String str = scanner.next();
            lists.add(new String(str));
        }
        int j = 0;
        for (String xi : lists) {
            System.out.println(j+1 + "番目>" + xi);
            j++;
        }
    }
}
