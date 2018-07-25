package day08.homework.OptionalHomework;

public class Computer extends Player{

    @Override
    public int showFist() {
        int a = 1;
        int b = 3;
        return (int)(Math.random() * (a + b - 1)) + a;
    }
}
