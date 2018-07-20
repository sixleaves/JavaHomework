package day03.homework;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        while (true) {

            System.out.println("请输入整数a:");
            int a = input.nextInt();
            System.out.println("请输入整数b:");
            int b = input.nextInt();


            if (a % b == 0 || a + b > 1000)
                System.out.println(a);
            else
                System.out.println(b);

        }


    }
}
