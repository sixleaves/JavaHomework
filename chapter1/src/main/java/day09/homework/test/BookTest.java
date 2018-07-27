package day09.homework.test;


import day09.homework.Book;

public class BookTest {
    public static void main(String[] args) {

        Book book = new Book();
        System.out.println(book.getDetail());

        Book book1 = new Book("春秋战国", 1000);
        System.out.println(book1.getDetail());

        Book book2 = new Book("五代十国", 100);
        System.out.println(book2.getDetail());

    }
}


