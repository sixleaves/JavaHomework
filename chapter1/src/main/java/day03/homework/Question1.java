package day03.homework;

import java.util.Scanner;

public class Question1 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("請輸入一個整數:");
        int num = input.nextInt();
        if (num > 0) System.out.println("大于0");
        else if (num < 0) System.out.println("小于0");
        else System.out.println("等于0");




    }

}
