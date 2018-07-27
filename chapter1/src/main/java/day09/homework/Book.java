package day09.homework;
/*
*
*
1：请通过代码封装，实现如下需求：
编写一个类Book，代表教材:
1)具有属性：名称（title）、页数（pageNum），其中页数不能少于200页，否则输出错误信息，并赋予默认值200
2)每个属性要求使用private修饰，并且为各属性设置赋值和取值方法
3)具有方法:detail，用来在控制台输出每本教材的名称和页数
4)提供两个构造器，一个无参，一个有参
4)编写测试类BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确


* */


public class Book {

    public Book() {

    }

    public Book(String title, int pageNum) {

        this.title = title;
        this.pageNum = pageNum;
    }


    public String getDetail() {
        return "title = " + title + " pageNum = " + pageNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {

        if (pageNum < 200) {
            pageNum = 200;
            System.out.println("错误信息");
        }
        this.pageNum = pageNum;
    }

    private String title;
    private int pageNum;
}


