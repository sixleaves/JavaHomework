package day06.homework;

import java.util.Scanner;

/*
* 高级题目：客户姓名管理系统，实现增删改查
增加功能如下：(进阶可以实现循环添加)
* */
public class Question5 {

    public static void main(String[] args) {

        CustomNameManageSystem customNameManageSystem = new CustomNameManageSystem();
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("*********************欢迎进入客户名管理系统*********************");
            int actionID = -1;
            while (actionID !=5 ) {
                customNameManageSystem.printMenus();
                System.out.print("请选择:");
                actionID = input.nextInt();
                switch (actionID) {
                    case 1: {
                        System.out.print("请输入要添加的姓名:");
                        String name = input.next();
                        boolean isAdd = false;
                        if (customNameManageSystem.isEmpty()) {
                            customNameManageSystem.add(name);
                        }else {
                            System.out.print("请输入要插入的位置:(第一个位置是0)");
                            int index = input.nextInt();
                            isAdd = customNameManageSystem.insertNameToIndex(name, index);
                        }
                        if (isAdd) {
                            System.out.println("添加成功");
                        }else {
                            System.out.println("添加失败");
                        }
                        customNameManageSystem.printAllNames();
                    }
                    break;
                    case 2: {

                        System.out.print("请输入要查找的姓名:");
                        String name = input.next();

                        int indexOfName = customNameManageSystem.queryName(name);
                        if (indexOfName >= 0) {
                            System.out.println(String.format("找到%s,其位置为%d", name, indexOfName));
                        }else {
                            System.out.println("查无此人");
                        }
                    }
                    break;
                    case 3: {
                        System.out.print("请输入要删除的姓名:");
                        String name = input.next();
                        if (customNameManageSystem.remove(name)) {
                            System.out.println("删除成功");
                        }else {
                            System.out.println("删除失败");
                        }
                        customNameManageSystem.printAllNames();

                    }
                    break;
                    case 4: {

                        System.out.print("请输入要修改的姓名:");
                        String oldName = input.next();
                        System.out.print("请输入新姓名:");
                        String newName = input.next();
                        if (customNameManageSystem.modify(oldName, newName)) {
                            System.out.println("修改成功");
                        }else {
                            System.out.println("修改失败");
                        }
                        customNameManageSystem.printAllNames();

                    }
                    break;

                    case 5: {
                        break;
                    }

                    default:
                        System.out.println("请输入有效数字!请重新输入!!!");
                        break;
                }
            }

            if (actionID == 5) {
                System.out.println("欢迎使用, 再见!");
                break;
            }

        }

    }

}


class CustomNameManageSystem {

    private static final int MAX_LENGTH = 10;
    private String[] names = new String[MAX_LENGTH];
    private int currentNum = 0;

    public void printMenus() {
        System.out.println("\n\n\t\t\t1.添加姓名\n" +
                "\t\t\t2.查找姓名\n" +
                "\t\t\t3.删除姓名\n" +
                "\t\t\t4.修改姓名\n" +
                "\t\t\t5.推出系统\n");

    }

    public void printAllNames() {

        System.out.println("*************************************************************");
        System.out.println("\t\t\t客户名列表");
        System.out.println("*************************************************************");
        for (int i = 0; i < currentNum; i++) {

            System.out.print(names[i] + "\t");

        }
        System.out.println();
    }

    public int getSizeOfNames() {
        return currentNum;
    }

    public boolean isEmpty() {
        return currentNum == 0;
    }




    // 增
    public boolean insertNameToIndex(String name, int index) {

        try {
            checkSpaceForSafe();

            // 向后移动1位
            for (int i = currentNum-1; i >= index; i--) {
                names[i+1] = names[i];
            }

            // 插入指定位置
            names[index] = name;
            currentNum++;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean add(String name) {
        return insertNameToIndex(name, currentNum);
    }




    // 查
    public int queryName(String name) {

        for (int i = 0; i < currentNum; i++) {

            if (name.equals(names[i])) {
                return i;
            }
        }
        return -1;
    }

    // 删
    public boolean remove(String name) {

        try {
            int indexOfName = queryName(name);
            for (int i = indexOfName; i < currentNum; i++) {
                names[i] = names[i+1];
            }
            currentNum--;
        }catch (Exception e) {
            return false;
        }
        return true;
    }

    // 改
    public boolean modify(String oldName, String newName) {
        try {
            int indexOfName = queryName(oldName);
            names[indexOfName] = newName;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public void checkSpaceForSafe() {
        if (currentNum + 1 > names.length) {
            String[] tempNames = new String[names.length * 2];
            for (int i = 0; i < names.length; i++) {
                tempNames[i] = names[i];
            }
            names = tempNames;
        }
    }





}

