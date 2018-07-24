package day07.homework;

import java.util.Arrays;

public class Question7 {

    public static void main(String[] args) {

        Integer [] nums = {1,2,3,4,5};
        Homework homework = new Homework();

        Integer[] temp = homework.copyOf(nums);

        temp[0] = 6;
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i] + "\t" + nums[i]);
        }

        System.out.println("------------------------------");

        int[] temp2 = new int[]{1,2,3,4,5};
        int[] temp3 = homework.copyOf(temp2);
        temp3[0] = 9;
        for (int i = 0; i < temp2.length; i++) {
            System.out.println(temp2[i] + "\t" + temp3[i]);
        }




    }

}
