package day04.homework;

/*
*
*
* 3)【选作】打印菱形
*
*
*
* */

public class Question7 {

    public static void main(String[] args) {

        int totalLines = 5;
        int numStar = 0;

        for (int i = 0; i < 5; i++) {

            if (i > totalLines / 2) {

                numStar = totalLines - 2*(i - totalLines / 2);
                int numLeftBlank = (totalLines - numStar) / 2;
                printBlank(numLeftBlank);
                for (int j = 0; j <numStar;j++)
                    System.out.print("*");
                System.out.print("\n");

            }else {

                numStar = 2 * i + 1;
                int numLeftBlank = (totalLines - numStar) / 2;
                printBlank(numLeftBlank);
                for (int j = 0; j < numStar;j++)
                    System.out.print("*");
                System.out.print("\n");
            }
        }
    }


    public static void printBlank(int num) {
        for (int i =0; i < num; i++) System.out.print(" ");
    }




}
