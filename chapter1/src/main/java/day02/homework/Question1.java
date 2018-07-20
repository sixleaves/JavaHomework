package day02.homework;

import java.util.Scanner;

public class Question1 {


    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            while (true) {

                System.out.println("请输入第一个整数:");
                int a =sc.nextInt();

                System.out.println("请输入第二个整数:");
                int b = sc.nextInt();


                System.out.println(String.format("%d + %d = ", a,b)    + calc(a, b, '+'));
                System.out.println(String.format("%d - %d = ", a, b)   + calc(a, b, '-'));
                System.out.println(String.format("%d * %d = ", a, b)   + calc(a, b, '*'));
                System.out.println(String.format("%d / %d = ", a, b)   + calc(a, b, '/'));
                System.out.println(String.format("%d %% %d = ", a, b) + calc(a, b, '%'));
            }

        }catch (Exception e) {
            e.printStackTrace();
        }




    }


    public static long calc(int a, int b, char operator) {

        long r = 0L;

        switch (operator) {

            case '+':  r = a + b; break;
            case '-':  r = a - b; break;
            case '*':  r = a * b; break;
            case '/':  r = a / b; break;
            case '%':  r = a % b; break;
            default:
                r = 0L;
        }

        return r;
    }


}
