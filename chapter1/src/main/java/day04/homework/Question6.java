package day04.homework;

/*
* 嵌套循环题目

1.打印图形

1）打印九九乘法表
2）打印如下图形：
A
BB
CCC
*
* */

import java.util.Scanner;

public class Question6 {


    public static void main(String[] args) {

        // 1）打印九九乘法表
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(String.format("%d * %d = %d", i, j, i * j) + "\t");
            }
            System.out.print("\n");
        }


        //2）打印如下图形
        char[] chs = new char[26];
        chs[0] = 'A';
        for (int i = 1; i < 26; i++) chs[i] = (char)(chs[i-1] + 1);
        System.out.print("请输入要打印到哪个字母:");
        Scanner input = new Scanner(System.in);
        char finalChar = input.next().toUpperCase().charAt(0);

        int finalPos = finalChar - 'A';

        for (int i = 0; i <= finalPos; i++) {

            for (int j = 0; j < i+1; j++) {
                System.out.print(chs[i]);
            }
            System.out.print('\n');
        }




    }

}
