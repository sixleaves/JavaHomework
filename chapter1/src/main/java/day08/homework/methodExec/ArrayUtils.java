package day08.homework.methodExec;

import java.util.Arrays;

public class ArrayUtils {


    public static void sortIntArray(int[] arr) {
        Arrays.sort(arr);
    }

    public static void sortCharArray(char[] chrs) {
        Arrays.sort(chrs);
    }

    public static int getMaxValue(int[] nums) {


        int max= nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (max < nums[i]) {

                max = nums[i];
            }
        }
        return max;
    }

    public static int queryValueInDoubleArray(double[] nums, double value) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {

            if (value == nums[i]) {
                index = i;
                break;
            }

        }

        return index;
    }

    public static int queryValueInStringArray(String[] strs, String value) {
        int index = -1;
        for (int i = 0; i < strs.length; i++) {

            if (value.compareTo(strs[i]) == 0) {
                index = i;
                break;
            }

        }

        return index;
    }

    public static double sumOfArray(double nums[][]) {

        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                sum += nums[i][j];
            }
        }
        return sum;
    }

    public static void printArray(double nums[][]) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static double getMaxValueInArray(double nums[][]) {

        double max = nums[0][0];
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                if (max < nums[i][j]) max = nums[i][j];
            }
        }

        return max;
    }




}
