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
        int numStart = totalLines - 2;

        for (int i = 0; i < 5; i++) {

            if (i > totalLines / 2) {

                numStart = totalLines - 2*(i - totalLines / 2);
                int numLeftBlack = (totalLines - numStart) / 2;
                printBlank(numLeftBlack);
                for (int j = 0; j <numStart;j++)
                    System.out.print("*");
                System.out.print("\n");

            }else {

                numStart = 2 * i + 1;
                int numLeftBlack = (totalLines - numStart) / 2;
                printBlank(numLeftBlack);
                for (int j = 0; j < numStart;j++)
                    System.out.print("*");
                System.out.print("\n");
            }
        }
    }


    public static void printBlank(int num) {
        for (int i =0; i < num; i++) System.out.print(" ");
    }




}
