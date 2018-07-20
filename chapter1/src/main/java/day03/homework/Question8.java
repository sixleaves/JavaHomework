package day03.homework;

import java.util.Scanner;
public class Question8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("请输入身高(cm):");
            double height = input.nextDouble();
            System.out.println("请输入体重(斤):");
            double weight = input.nextDouble();

            double standardWeight = (height - 108)*2;

            int distance = (int) Math.abs(standardWeight - weight);

            if (distance > 10) {
                System.out.println("体重不合适");
            }else {
                System.out.println("体重合适");
            }


        }

    }

}
