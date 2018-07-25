package day08.homework.ObjectArray;

public class MyDate {

    public MyDate() {

    }

    public MyDate(int year, int month , int day) {

        this.year = year;
        this.month = month;
        this.day= day;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    private int year;
    private int month;
    private int day;

    @Override
    public String toString() {
        return String.format("%d年%d月%d日", year, month, day);
    }

    public static void main(String[] args) {


        MyDate d1 = new MyDate(1990,1,1);
        MyDate d2 = new MyDate(2008,8,8);
        MyDate d3 = new MyDate(2018,7,25);



        MyDate[] myDates = new MyDate[3];
        myDates[0] = d1;
        myDates[1] = d2;
        myDates[2] = d3;


        for (int i = 0; i < myDates.length;i++) {

            System.out.println(myDates[i]);

        }





    }


}
