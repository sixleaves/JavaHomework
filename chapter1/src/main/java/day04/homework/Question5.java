package day04.homework;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {


        int num = -1;

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("请输入一个整数:");
            num = input.nextInt();


            for (int i = 0; i <= num; i++) {

                int j = num -i;
                System.out.println(String.format("%d+%d=%d", i, j , num));

            }

        }

    }

}
