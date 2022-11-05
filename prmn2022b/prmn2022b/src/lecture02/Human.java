package lecture02;

public class Human {
    String name;
    int age;

    void hito(String n, int a) {
        this.name = n;
        this.age = a;

        System.out.print(name + "は　" + age + "歳です。");
        if (age < 18) {
            System.out.print("生徒です。");
        } else {
            System.out.print("学生です。");
        }
    }
}
