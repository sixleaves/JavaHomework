package day04.homework;

import java.util.Scanner;

public class Question2 {


    public static void main(String[] args) {

        int selectID = -1;
        Scanner input = new Scanner(System.in);
        boolean isExit = false;
        do {

            System.out.println("------------------------------小小计算器-------------------------");

            System.out.print("1.加法\n" +
                    "2.减法\n" +
                    "3.乘法\n" +
                    "4.除法\n" +
                    "0.退出\n" +
                    "请选择:");

            selectID = input.nextInt();

            switch (selectID) {
                case 0: isExit =true;break;
                case 1: System.out.println("10+5=15");break;
                case 2: System.out.println("10-5=10");break;
                case 3: System.out.println("10*5=50");break;
                case 4: System.out.println("10/5= 2"); break;
            }
        }while (selectID != 0);
        System.out.println("程序退出");

    }

}
