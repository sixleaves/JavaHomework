package day09.homework.test;

import day09.homework.Student;

public class StudentTest {

    public static void main(String[] args) {


        Student stu1 = new Student();
        stu1.intros();

        Student stu2 = new Student("苏威鹏", 26, '男', "大数据");
        stu2.intros();



    }

}
