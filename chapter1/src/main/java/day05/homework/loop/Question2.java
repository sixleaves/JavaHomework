package day05.homework.loop;


/*
*
* 2.打印100内的所有质数
*
* */

public class Question2 {


    public static void main(String[] args) {


        for (int i = 2; i <= 100; i++) {
            int j = 2;
            for (; j <= i - 1; j++) {
                if (i % j == 0) break;
            }

            if (j == i) {
                System.out.println(i);
            }
        }


    }


}
