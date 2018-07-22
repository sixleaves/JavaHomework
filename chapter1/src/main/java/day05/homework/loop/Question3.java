package day05.homework.loop;

import java.util.Scanner;

/*
* 3.随机猜数游戏：
随机生成一个1——100的整数
有十次机会
如果第一次就猜中，提示 “你真是个天才”
如果第2——3次猜中，提示“你很聪明，赶上我了”
如果第4——9次猜中，提示“一般般”
如果最后一次猜中，提示“可算猜对啦”
一次都没猜对，提示“说你点啥好呢”
*
* */
public class Question3 {


    public static void main(String[] args) {

        int NUM_OF_CHANCES= 10;
        int remainChances =  NUM_OF_CHANCES;
        int a = 1;
        int b = 100;
        int randomNumber = (int)(Math.random() * (b-a+1)) +a;
        boolean isGuess = false;
        Scanner input = new Scanner(System.in);
        while (remainChances != 0) {

            System.out.print("你还有" + remainChances + "次机会, 请输入猜测的数(1~100):");
            int num = input.nextInt();
            remainChances--;

            // 如果第一次就猜中，提示 “你真是个天才”
            int current = NUM_OF_CHANCES - remainChances;
            if (num == randomNumber) {

                isGuess = true;
                if (1 == current) {

                    System.out.println("你真是个天才");
                }else if ((2 ==current || 3 == current)) {

                    System.out.println("你很聪明，赶上我了");

                }else if ((4 <=current || 9 >= current)) {

                    System.out.println("一般般");
                }else {

                    System.out.println("可算猜对啦");
                }

                break;
            }

            System.out.println();
        }


        if (!isGuess) {
            System.out.println("说你点啥好呢");
        }
    }


}
