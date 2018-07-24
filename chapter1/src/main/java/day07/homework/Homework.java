package day07.homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework {


    // 打印99乘法表
    public void printNineNineTable() {

        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(String.format("%d * %d = %d\t", i, j, i * j));
            }
            System.out.println();
        }
    }

    // 求double数组的最大值
    public double getMaxValueFromArray(double [] nums) {

        if (nums == null || nums.length == 0) {
            throw new RuntimeException("数组为null或者没有元素");
        }

        double max = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    // 查找某字符串数组中的元素查找，并返回索引，如果找不到，返回-1
    public int indexOfStringInArray(String[] strs, String queryStr) {

        int index = -1;

        for (int i = 0; i < strs.length; i++) {

            if (strs[i].equals(queryStr)) {
                index = i;
                break;
            }
        }

        return  index;
    }

    // 打印某char数组中的所有元素
    public void printCharArray(char[] arr) {

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
    }


    // 打印某char数组中的所有元素
    public void printObjectArray(Object[] arr) {

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
    }


    // 字符数组进行排序
    public void sortCharArray(char[] arr) {
        Arrays.sort(arr);
    }

    // 实现数组的复制功能，根据旧数组，返回一个新数组，元素和旧数组一样
    public <T>T[] copyOf(T[] oldArray) {

        T[] newArray = (T[])Array.newInstance(oldArray.getClass().getComponentType(), oldArray.length);

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    public int[] copyOf(int[] oldArray) {

        int[] newArray = (int[])Array.newInstance(oldArray.getClass().getComponentType(), oldArray.length);

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    public double[] copyOf(double[] oldArray) {

        double[] newArray = (double[])Array.newInstance(oldArray.getClass().getComponentType(), oldArray.length);

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }



}
