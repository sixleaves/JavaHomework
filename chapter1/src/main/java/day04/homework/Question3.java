package day04.homework;

import java.util.Scanner;

/*
*
* 3.输入年月日，判断该日是当年的第几天
*
* */
public class Question3 {

    public static void main(String[] args) {

        int year, month, day;

        Scanner input = new Scanner(System.in);

        // 初始化闰年的每月天数
        int [] dayOfMonths = {31,28,31,30,31,30,31,31,30,31,30,31};

        // 每个月第一天对应是当前年的第几天, 从0开始计算,即第一天为0.
        int [] totalDays = new int[12];
        totalDays[0] = 0;
        for (int i = 1; i < 12; i++) {
            totalDays[i] = totalDays[i - 1] + dayOfMonths[i];
        }


        while (true) {

            System.out.println("请输入 年 月 日,用空格分隔");

            year = input.nextInt();
            month = input.nextInt();
            day = input.nextInt();

            boolean isLeap= isLeapYear(year);
            if (isLeap) dayOfMonths[1] = 29;



            int passDays = totalDays[month - 1] + day;

            if (month > 2) {
                passDays += (isLeap == true?1:0);
            }


            System.out.println(String.format("%d年 %d月 %d号 是第 %d 天", year,month, day, passDays));
        }
    }


    // 判断是否是闰年
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }

}
