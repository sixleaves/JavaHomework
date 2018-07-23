package day06.homework;

import java.util.Arrays;
import java.util.Comparator;

/*
*
* 1、定义一个字符串，保存5个输入的单词，然后从高到低排序
 * */
public class Question1 {


    public static void main(String[] args) {

        String[] strs = new String[]{"Bord", "Apple", "Gun", "Sunny", "Car"};

        // 版本1. 冒泡排序法
        int n = strs.length - 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n-i; j++) {

                if (strs[j].compareTo(strs[j+1]) < 0) {

                    String temp = strs[j+1];
                    strs[j+1] = strs[j];
                    strs[j] = temp;

                }

            }
        }
        myPrint(strs);
        System.out.println();

        // 版本2. Arrays包实现的快排
        strs = new String[]{"Bord", "Apple", "Gun", "Sunny", "Car"};
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        myPrint(strs);




    }


    public static void myPrint(Object[] arr) {

        for (int i =0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }


    }

}
