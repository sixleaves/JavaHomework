package day07.homework;
// 八.判断Book对象 的价格，如果价格>100,则更改价格为100，如果价格>50，则更改价格为60，否则更改为50，最后显示最新的价格
//定义Book类，里面有价格属性
public class Question8 {

    public static void main(String[] args) {

        Book book = new Book();
        book.setPrice(110);
        book.show();

        book.setPrice(70);
        book.show();

        book.setPrice(30);
        book.show();

    }
}


class Book {

    private double price;

    public void show() {
        System.out.println("书本价格: " + price + "元");
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {

        if (price > 100)
            this.price = 100;
        else if (price > 50)
            this.price = 60;
        else
            this.price = 50;
    }
}
