package day03.homework;

import java.util.Scanner;

public class Question6 {


    public static void main(String[] args) {


        String userName = "张三";
        String password = "1234";
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名:");
            String loginName = input.next();
            System.out.println("请输入密码:");
            String loginPwd = input.next();


            if (loginName.equals(userName) && loginPwd.equals(password)) {
                System.out.println("登入成功");
            }else {
                System.out.println("用户名或者密码错误\n");
            }
        }

    }

}
