package lecture03;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        System.out.print("任意の文字を入力してください:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print(str);
    }
}
