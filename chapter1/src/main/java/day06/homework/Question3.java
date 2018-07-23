package day06.homework;

import java.util.Scanner;

/*
*
* 3、定义一个3行4列的二维数组，逐个从键盘输入值，编写程序将四周的数据清0
*
* */
public class Question3 {


    public static void main(String[] args) {

        int [][] nums = new int[3][4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                System.out.print(String.format("请输入第%d行%d个数:", i + 1, j + 1));
                nums[i][j] = input.nextInt();
            }
        }

        // 将数组四周清0
        for (int col = 0; col < nums[0].length; col++) nums[0][col] = 0;
        for (int row = 0; row < nums.length; row++) nums[row][nums[0].length - 1] = 0;
        for (int col = nums[0].length - 1; col >= 0; col--) nums[nums.length - 1][col] = 0;
        for (int row = nums.length - 1; row >=0; row--) nums[row][0] = 0;

        // 输出
        for (int i = 0; i < nums.length; i++) {

            for (int j =0; j < nums[i].length; j++) {

                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
