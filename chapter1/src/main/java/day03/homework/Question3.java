package day03.homework;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("请输入一个整数:");
            int num = input.nextInt();

            String numStr = num + "";
            if (numStr.length() != 3) {
                System.out.println(numStr + "不是水仙花数");
            }else {

                int a = num % 10;
                int b = num / 10 % 10;
                int c = num / 100;

                if (a * a * a + b * b *b + c * c * c == num) {
                    System.out.println(numStr + "是水仙花数");
                }else {
                    System.out.println(numStr + "不是水仙花数");
                }


            }

        }

    }

}
