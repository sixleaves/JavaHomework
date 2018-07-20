package day03.homework;


import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            int magicNumber = (int) (Math.random() * 90 + 10);
            System.out.println("请输入一个两位数:");
            int userNumber = input.nextInt();

            System.out.println("本期开奖号:" + magicNumber);

            if (userNumber == magicNumber) {
                System.out.println("恭喜获奖10000美金");
            }else if (isSameNumberButOrder(magicNumber, userNumber)){
                System.out.println("恭喜获奖3000美金");
            }else if (isMatchOneInOrder(magicNumber, userNumber)) {
                System.out.println("恭喜获奖1000美金");
            }else if (isMatchOneButOrder(magicNumber, userNumber)) {
                System.out.println("恭喜获奖500美金");
            }else {
                System.out.println("没有中奖");
            }
        }

    }

    private static boolean isMatchOneButOrder(int magicNumber, int userNumber) {

        String magicStr = magicNumber + "";
        String userStr = userNumber + "";
        int userStrSize = userStr.length();
        for (int i = 0 ; i < userStrSize; i++) {

            char ch = userStr.charAt(i);
            if (magicStr.contains(ch + "")) return true;
        }

        return false;
    }

    private static boolean isMatchOneInOrder(int magicNumber, int userNumber) {
        String magicStr = magicNumber + "";
        String userStr = userNumber + "";
        int userStrSize = userStr.length();
        for (int i = 0 ; i < userStrSize; i++) {

            char ch = userStr.charAt(i);
            if (magicStr.contains(ch+"") && ch == magicStr.charAt(i)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isSameNumberButOrder(int magicNumber, int userNumber) {
        char[] magicNumberChars = (magicNumber + "").toCharArray();
        char[] userNumberChars = (userNumber + "").toCharArray();
        boolean isSameNumberButOrder = true;
        if (magicNumberChars.length == userNumberChars.length) {

            int magicNumberSize = magicNumberChars.length;

            for (int i = 0; i < magicNumberSize; i++) {

                if (magicNumberChars[i] != userNumberChars[i]) {
                    isSameNumberButOrder = false;
                }

            }
        }else {
            isSameNumberButOrder = false;
        }

        return isSameNumberButOrder;
    }

}
