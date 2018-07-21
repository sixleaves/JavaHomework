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

        int totalLines = 15;
        int numStar = 0;
        int numLeftBlank = 0;
        for (int i = 0; i < totalLines; i++) {

            if (i > totalLines / 2) {
                numStar = totalLines - 2*(i - totalLines / 2);
                numLeftBlank = (totalLines - numStar) / 2;

            }else {
                numStar = 2 * i + 1;
                numLeftBlank = (totalLines - numStar) / 2;
            }

            printBlank(numLeftBlank);
            printStar(numStar);
            System.out.print("\n");
        }
    }


    public static void printBlank(int num) {
        for (int i =0; i < num; i++) System.out.print(" ");
    }

    public static void printStar(int num) { for (int i =0; i < num; i++) System.out.print("*"); }

}
