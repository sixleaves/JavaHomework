package day07.homework;

import java.util.Scanner;

/*
*
*
*
九.使用面向对象的方式，实现小小计算器
请输入第一个整数：10
请输入第二个整数：5

*************************************

	    小小计算器

*************************************

10 + 5 =15

10 - 5 = 5

10 * 5 = 50

10 / 5 = 2

是否继续？y/n :y

请输入第一个整数：2
请输入第二个整数：3

*************************************

	    小小计算器


*************************************


2 + 3 = 5

2 - 3 =-1

2 * 3 =6

2 / 3 =0

是否继续？y/n :n
程序结束


*
*
*
* */
public class Question9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calc calc = new Calc();
        while (true) {

            System.out.print("请输入第一个整数：");
            int num1 = input.nextInt();
            System.out.print("请输入第二个整数：");
            int num2 = input.nextInt();


            calc.setNum1(num1);
            calc.setNum2(num2);
            calc.print();

            System.out.print("是否继续? y/n:");
            char ch = input.next().charAt(0);
            if ('n' == ch) {
                System.out.println("程序结束");
                break;
            }
        }
    }

}

class  Calc {

    private int num1;
    private int num2;

    public void print() {


        System.out.println(
                "\n" +
                        "*************************************\n" +
                        "\n" +
                        "\t    小小计算器\n" +
                        "\n" +
                        "\n" +
                        "*************************************");

        System.out.println(String.format("%d + %d = %d", num1,num2, add()));
        System.out.println(String.format("%d - %d = %d", num1,num2, minus()));
        System.out.println(String.format("%d * %d = %d", num1,num2, multiply()));
        System.out.println(String.format("%d / %d = %d", num1,num2, divid()));


    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }


    public int add() {
        return getNum1() + getNum2();
    }

    public int divid() {
        if (getNum2() != 0)
            return getNum1() / getNum2();
        else {
            throw new RuntimeException("除数不能为0");
        }
    }

    public int multiply() {
        return getNum1() * getNum2();
    }

    public int minus() {
        return getNum1() - getNum2();
    }

}