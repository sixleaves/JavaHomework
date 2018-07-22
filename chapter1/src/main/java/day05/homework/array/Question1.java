package day05.homework.array;

/*
*
* 1.通过命令行接收8个double数字保存到数组，并
* 序打印以
* 及求平均值、
* 求最大值
* 最大值的下标，
* 并通过键盘输入一个元素，添加到新数组中，并打印添加后的效果
*
* */

import java.util.Scanner;

public class Question1 {


    public static void main(String[] args) {


        double[] nums = new double[8];

        Scanner input = new Scanner(System.in);

        // 1.输入8个double数据, 保存到数组
        for (int i = 0; i < 8; i++) {
            nums[i] = input.nextDouble();
        }

        // 2.倒序打印
        for (int i = 7; i >= 0; i--) {
            System.out.print(nums[i] + "\t");
        }

        // 3.求平均值
        double sum =0.0;
        for (int i = 0; i < 8; i++) {
            sum += nums[i];
        }

        System.out.println("平均值=" + sum/8);

        // 4.求最大值和最大值下标
        double max = nums[0];
        int maxIndex = 0;
        for (int i = 1; i < 8; i++) {

            if (max < nums[i]) {

                max = nums[i];
                maxIndex = i;
            }
        }

        System.out.println("max =" + max + " maxIndex= " + maxIndex);

        // 5.通过键盘输入一个新元素,添加到新数组
        double[] nums2 = new double[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }

        System.out.print("请输入一个新元素:");
        double num = input.nextDouble();
        nums2[nums.length] = num;

        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + "\t");
        }



    }

}
