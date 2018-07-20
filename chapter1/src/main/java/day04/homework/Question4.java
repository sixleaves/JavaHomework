package day04.homework;

/*
*
*
* 4.【选作】输入一个数字，通过循环统计位数，以及打印出每个位上的数是什么
*
* */

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        int num = -1;

        Scanner input = new Scanner(System.in);

        while (true) {

            num = input.nextInt();


            int count = 0;
            while (num != 0) {
                System.out.println(num % 10);
                num /= 10;
                count++;
            }

            System.out.println(String.format("一共 %d 位", count));
        }

    }

}

