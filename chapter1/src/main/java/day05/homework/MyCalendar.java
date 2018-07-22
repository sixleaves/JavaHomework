package day05.homework;

import java.util.Scanner;

/*
*
需求：根据年份和月份，打印当月日历
备注：
判断星期几的公式：

1900——当前日期的天数差%7+1，7 为星期日，1为星期一
*
* */
public class MyCalendar {


    // 初始化闰年的每月天数
    public static int [] dayOfMonths = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) {

        int year, month, day;

        Scanner input = new Scanner(System.in);

        int [][] calendar;
        while (true) {
            calendar = new int[6][7];
            System.out.print("请选择年份:");
            year = input.nextInt();

            System.out.print("请选择月份:");
            month = input.nextInt();

            // 更正选择的年份的2月份天数
            if (isLeapYear(year))  dayOfMonths[1] = 29;
            else dayOfMonths[1] = 28;

            day = dayOfMonths[month - 1];

            int row = 0;
            int col = 0;

            // 计算第一天再第一行的位置
            int j = getPassDayFrom(
                    1990, 1,1,
                    year, month, 1);
            int dayOfWeek = j % 7 + 1;

            // 填充日历
            col = dayOfWeek == 7? 0: dayOfWeek;
            calendar[row][col++] = 1;
            for (int i = 2; i <= day; i++) {
                calendar[row][col++] = i;
                if (col > 6) {
                    row++;
                    col = 0;
                }
            }

            // 输出日历

            System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
            for (int i = 0; i < 6; i++) {

                for (int k = 0; k < 7; k++) {

                    if (0 == calendar[i][k]) {
                        System.out.print("\t\t");
                    }else {
                        System.out.print(calendar[i][k] + "\t\t");
                    }

                }

                System.out.println();
            }



        }
    }


    public static int getPassDayFrom(int fromYear, int fromMonth, int fromDay,
                                     int endYear, int endMonth, int endDay) {

        int numberOfDays = 0;

        while (true) {

            // 数到对应日期则退出循环
            if (    endYear == fromYear &&
                    endMonth == fromMonth &&
                    endDay == fromDay) {

                break;
            }

            // 修正当前年二月份的天数
            if (isLeapYear(fromYear))
                dayOfMonths[1] = 29;
            else
                dayOfMonths[1] = 28;

            // 判断当前天的下一天是不是下个月第一天
            fromDay++;
            if (fromDay > dayOfMonths[fromMonth - 1]) {

                fromMonth++;
                fromDay = 1;
            }

            if (fromMonth > 12) {

                fromYear++;
                fromMonth = 1;
            }

            numberOfDays++;
        }
        return numberOfDays;
    }

    // 判断是否是闰年
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    }
}
