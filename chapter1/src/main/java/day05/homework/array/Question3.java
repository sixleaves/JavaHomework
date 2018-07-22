package day05.homework.array;

import java.util.Scanner;

/*
*
* 3.   统计五名员工工资，查找里面是否有<10000的
* */
public class Question3 {

    public static void main(String[] args) {


        double[] salarys = new double[5];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < salarys.length; i++) {
            System.out.print("请输入第" + (i+1) + "名员工工资:");
            salarys[i] = input.nextDouble();
        }
        int i = 0;
        for ( ;i < salarys.length; i++) {
            if (salarys[i] < 10000) break;
        }

        if (i >= salarys.length) {
            System.out.println("没有找到工资小于10000的员工");
        }else {
            System.out.println("找到工资小于10000的员工, 其工资为:" + salarys[i]);
        }
    }

}
