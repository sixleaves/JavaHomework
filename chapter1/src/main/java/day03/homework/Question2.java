package day03.homework;

import java.util.Scanner;

public class Question2 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("请输入年份:");
            int year = input.nextInt();

            System.out.println(year + (isLeapYear(year)?"是闰年":"不是闰年"));

        }

    }

    public static boolean isLeapYear(int year) {

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }

}
