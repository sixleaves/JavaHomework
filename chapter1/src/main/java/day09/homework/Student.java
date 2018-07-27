package day09.homework;
/*
*
* 2：编写一个类Student，代表学员，要求：
（1）具有属性：姓名、年龄、性别、专业。对其进行合理封装。
要求：年龄0——120，性别只能是男或女，专业必须是 ：java或大数据或h5或python

（2）提供有参构造器和无参构造器
（3）具有方法：自我介绍，负责输出该学员的姓名、年龄、性别以及专业。
编写测试类StudentTest进行测试，对两个Student对象的初始化工作（调用不同的构造器），并分别调用它们的自我介绍方法，看看输出是否正确。




细节要求：实体类和测试类放在不同包，体会跨包访问类的特点
* */
public class Student {



    public Student() {

    }

    public Student(String name, int age, char gender, String major) {

        setName(name);
        setAge(age);
        setGender(gender);
        setMajor(major);
    }


    public void intros() {

        System.out.println("我的名字是:" + name + " 今年" + age + "岁, 性别是" + gender + " 专业是" + major);

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age >= 0 && age <= 120)
            this.age = age;
        else {
            System.out.println("年龄范围不合理,请重新设置");
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == '男' || gender == '女')
            this.gender = gender;
        else {
            System.out.println("性别只能是 男/女");
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if ("java".equals(major) ||
                "大数据".equals(major) ||
                "h5".equals(major) ||
                "python".equals(major))
            this.major = major;
        else {
            System.out.println("请设置正确的专业名(java或大数据或h5或python)");
        }
    }

    private String name;
    private int age;
    private char gender;
    private String major;




}
