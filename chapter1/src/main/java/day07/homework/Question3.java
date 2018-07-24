package day07.homework;

public class Question3 {

    public static void main(String[] args) {

        String[] strs = {"test", "苏苏苏", "福建", "北京"};

        Homework homework = new Homework();
        int index = homework.indexOfStringInArray(strs, "福建");
        if (index != -1) {
            System.out.println("找到元素, 索引位置为:" + index);
        }else {
            System.out.println("找不到元素");
        }
    }
}
