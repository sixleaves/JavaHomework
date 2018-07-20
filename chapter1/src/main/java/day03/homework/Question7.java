package day03.homework;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        while (true) {

            System.out.println("请输入年:");
            int year = input.nextInt();

            System.out.println("请输入月份:");
            int month = input.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("输入的月份无效,请重新输入");
                continue;
            }
            if (isLeapYear(year)) days[1] = 29;

            System.out.println(String.format("%d年的%d月, 有%d天", year, month, days[month - 1]));




        }

    }

    public static boolean isLeapYear(int year) {

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }
}
