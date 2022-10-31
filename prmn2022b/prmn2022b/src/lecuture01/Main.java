package lecuture01;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("b2210180 Yu Ichihashi");

        //int studentNumber = 2210180;
        //System.out.println("b" + studentNumber + " Yu Ichihashi");

        //if(age < 20 && 0 >= age) {
        //  System.out.println("I am " + age + " years old so I cannot drink liquor.");
        //}
        //else if(age < 0){
        //  System.out.println("Error");
        //}
        //else{
        //  System.out.println("I am " + age +" years old so I can drink liquor.");
        //}

        //int[] array = new int[100];

        //int x = 1;
        //int sum = 0;

        //for(int i = 0;i < array.length;i++){
        //array[i] = x;
        //if(x % 2 == 0){
        //sum = sum + x;
        //}
        //x = x + 1;
        //}
        //System.out.println(sum);

        int[] score = {41, 85, 72, 38, 80};


        for (int i = 0; i < score.length; i++) {
            int x = score[i];
            if(x >= 90){
                System.out.println(i + "番　" + x + "点　" +" 秀 ");
            }
            else if (x < 90 && x >= 80){
                System.out.println(i + "番　" + x + "点　" +" 優 ");
            }
            else if (x < 80 && x >= 70){
                System.out.println(i + "番　" + x + "点　" +" 良 ");
            }
            else if (x < 70 && x >= 60){
                System.out.println(i + "番　" + x + "点　" + " 可 ");
            }
            else{
                System.out.println(i + "番　" + x + "点　" + " 不可 ");
            }
        }


        int a = max(score);
        int b = min(score);
        double c = average(score);
        System.out.println("max=" + a);
        System.out.println("min=" + b);
        System.out.println("average=" + c);


    }
    public static int max(int[] x){
        int ma = x[0];
        for (int i = 0; i < x.length; i++) {
            if (ma < x[i]) {
                ma = x[i];
            }
        }
        return ma;
    }

    public static int min ( int[] x){
        int mi = x[0];
        for (int i = 0; i < x.length; i++) {
            if (mi > x[i]) {
                mi = x[i];
            }
        }
        return mi;
    }
    public static double average ( int[] x){
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        double ave = sum / x.length;
        return ave;
    }

}



