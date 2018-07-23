package day06.homework;

import java.util.Scanner;

/*
* 4、【选作】一已知有个排序好（升序）的数组，要求插入一个元素，最后打印该数组，顺序依然是升序
*
* */
public class Question4 {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,5,5,6,7,7,8,9};

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.print("插入前的数组为:");
            for (int i = 0 ;  i < nums.length; i++) {
                System.out.print(nums[i] +  "\t");
            }

            System.out.println();

            System.out.print("请输入要插入的数:");
            int insertNumber = input.nextInt();

            int [] tempNums = new int[nums.length + 1];

            int i = 0;
            int j = 0;
            for (; i < nums.length; i++) {

                if (insertNumber > nums[i]) {
                    tempNums[j++] = nums[i];
                }else {
                    tempNums[j++] = insertNumber;
                    break;
                }
            }

            if (i >= nums.length) {
                tempNums[tempNums.length - 1] = insertNumber;
            }else {
                for (;i<nums.length; i++) {
                    tempNums[j++] = nums[i];
                }
            }

            System.out.print("插入后的数组为:");
            nums = tempNums;
            for (i = 0 ;  i < nums.length; i++) {
                System.out.print(nums[i] +  "\t");
            }

            System.out.println();


        }



    }

}
