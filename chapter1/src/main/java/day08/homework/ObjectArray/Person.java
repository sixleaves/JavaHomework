package day08.homework.ObjectArray;

import java.util.Arrays;

public class Person {

    private String name;
    private Integer age;
    private Book[] loveBooks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Book[] getLoveBooks() {
        return loveBooks;
    }

    public void setLoveBooks(Book[] loveBooks) {
        this.loveBooks = loveBooks;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append(
                "Person's name = " + name + " age = " + age + " love books =");
        for (int i = 0; i < loveBooks.length;i++) {
            sb.append(" " + loveBooks[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {


        Person[] persons = new Person[3];
        String[] names = {"lili", "zhangzhang", "wangwang"};
        Integer[] ages = {24,28,40};
        Book[][] books = new Book[][]{
                {new Book(100, "红楼梦"), new Book(80, "白楼梦"), new Book(899, "黑楼梦")},
                {new Book(10, "蓝楼梦"), new Book(5, "紫楼梦"), new Book(55, "黄楼梦")},
                {new Book(55, "绿楼梦"), new Book(49, "棕楼梦")}
        };


        for (int i = 0; i < persons.length; i++){

            Person p = new Person();
            p.setName(names[i]);
            p.setAge(ages[i]);
            p.setLoveBooks(books[i]);

            persons[i] = p;
        }

        System.out.println("未排序前");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }


        for (int i = 0; i < persons.length; i++) {

            Arrays.sort(persons[i].loveBooks);
        }
        System.out.println("未排序后");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }



    }


}


class Book implements Comparable<Book>{

    @Override
    public int compareTo(Book o) {
        return (int)(this.price - o.price);
    }

    private double price;
    private String name;

    @Override
    public String toString() {
        return "(Book's name = " + name + " Book's Price = " + price + ")";
    }

    public Book() {

    }

    public Book(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
