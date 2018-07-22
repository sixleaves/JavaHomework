package day05.homework.array;

import java.util.Arrays;

/*
*
* 2.   有一列乱序的字符，
* ‘a’,‘c’,‘u’,‘b’,‘e’,‘p’,‘f’,‘z’，
* 排序并按照英文字母表的逆序输出
*
* */
public class Question2 {


    public static void main(String[] args) {


        char[] chs = new char[]{'a','c','u','b','e', 'p', 'f', 'z'};

        Arrays.sort(chs);

        for (int i = chs.length - 1; i >=0; i--)
            System.out.print(chs[i] + "\t");

    }
}
