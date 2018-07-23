package day06.homework;

import java.util.Scanner;
/*
* 2、定义二维数组，用于保存三个班，每个班五名同学成绩，并求出每个班级平均分、以及所有班级平均分
* */
public class Question2 {


    public static void main(String[] args) {

        // 声明并分配内存空间
        double [][] scores = new double[3][5];

        Scanner input = new Scanner(System.in);

        // 赋值
        for (int row = 0 ; row < scores.length; row++) {

            for (int col = 0; col < scores[row].length; col++) {

                System.out.print(String.format("请输入第%d班, 第%d同学的成绩:", row+1, col+1));
                scores[row][col] = input.nextDouble();
            }
        }

        // 计算每个班的平均分和所有班的平均分
        double totalScore = 0.0;
        for (int row = 0; row < scores.length; row++) {

            double sumScoreOfPerClassroom = 0.0;
            for (int col = 0; col < scores[row].length; col++) {

                sumScoreOfPerClassroom += scores[row][col];

            }

            System.out.println(String.format("第%d班的平均分是: %f", row + 1,sumScoreOfPerClassroom/scores[row].length));

            totalScore += sumScoreOfPerClassroom;
        }

        System.out.println(String.format("所有班的平均分: %f", totalScore / (scores.length * scores[0].length)));
    }

}
