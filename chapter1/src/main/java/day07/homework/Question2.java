package day07.homework;


public class Question2 {


    public static void main(String[] args) {


        double[] nums = {1.0, 10.0, 5.0, 9.9, 100.1, 59.0};

        Homework homework = new Homework();
        double max = homework.getMaxValueFromArray(nums);
        System.out.println("max value=" + max);
    }

}
