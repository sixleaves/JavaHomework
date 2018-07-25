package day08.homework.OptionalHomework;

import java.util.Scanner;

public class Person extends Player{

    private Scanner input = new Scanner(System.in);

    @Override
    public int showFist() {
        System.out.print("请出拳: " + Constant.FIST_RULE + "(输入相应数字)");
        return input.nextInt();
    }
}
