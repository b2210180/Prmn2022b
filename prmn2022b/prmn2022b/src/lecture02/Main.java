package lecture02;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("氏名:");
        String n = input.next();
        System.out.print("年齢:");
        int a = input.nextInt();

        Human human = new Human();
        human.hito(n, a);
    }
}
