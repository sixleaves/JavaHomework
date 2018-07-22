package day05.homework.loop;

public class Question4 {


    public static void main(String[] args) {

        double height = 100D;
        double sum = 0.0;
        for (int i = 0; i < 10; i++) {

            // 落地
            sum += height;
            height /= 2;

            // 反弹
            sum += height;
        }

        System.out.println("总共经过" + sum + "米" + " 第10次反弹后高度为:" + height);

    }

}
