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

        int[] array = new int[100];

        int x = 1;
        int sum = 0;

        for(int i = 0;i < array.length;i++){
        array[i] = x;
        if(x % 2 == 0){
        sum = sum + x;
        }
        x = x + 1;
        }
        System.out.println(sum);
    }
}


