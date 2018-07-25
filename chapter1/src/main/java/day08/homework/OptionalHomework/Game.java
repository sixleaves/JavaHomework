package day08.homework.OptionalHomework;

import java.util.Scanner;

public class Game {

    private int[][] win = {
            {0, -1, 1},
            {1, 0, -11},
            {-1, 1, 0}
    };
    private String[] fists={"剪刀", "石头", "布"};
    private String[] computerNames = {"刘备", "孙权", "曹操"};
    private Scanner input = new Scanner(System.in);


    private StringBuilder sb = new StringBuilder();

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public void setFirstPlayer(Player firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    public Player getSecondPlayer() {
        return secondPlayer;
    }

    public void setSecondPlayer(Player secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public int getPlayTimes() {
        return playTimes;
    }

    public void setPlayTimes(int playTimes) {
        this.playTimes = playTimes;
    }

    private Player firstPlayer;
    private Player secondPlayer;

    private int playTimes;

    public void init() {

        System.out.println("-----------------------------------欢迎进入游戏世界-----------------------------------\n\n" +
                "\t\t\t\t\t********************************************\t\t\t\t\t\n" +
                "\t\t\t\t\t**\t\t\t\t猜拳, 开始  \t\t\t\t**\t\t\t\t\t\n" +
                "\t\t\t\t\t********************************************\t\t\t\t\t");

    }

    public void startPlay() {

        this.showRule();
        int computerPlayerID = this.selectComupterPlayer();
        String computerPlayerName = computerNames[computerPlayerID - 1];
        Computer computer = new Computer();
        computer.setName(computerPlayerName);
        setFirstPlayer(computer);

        String myName = this.readPlayerName();
        Person my = new Person();
        my.setName(myName);
        setSecondPlayer(my);

        this.showVSInfo();
        if (this.isStart()) {

            do {
                playTimes++;
                int myFist = getSecondPlayer().showFist();
                int compFist = getFirstPlayer().showFist();
                System.out.println("你出拳:" + fists[myFist - 1]);
                System.out.println(getFirstPlayer().getName() + ":" + fists[compFist -1]);
                this.judgeResultAndShowResult(myFist, compFist);
            }while (this.isNext());

        }
        this.showResultDetail();
    }

    private void showResultDetail() {

        showVSInfo();
        System.out.println("对战次数:" + playTimes);



        System.out.println("姓名\t\t得分\n" +
                getSecondPlayer().getName() + "\t\t" +getSecondPlayer().getCredits() + "\n" +
                getFirstPlayer().getName() + "\t\t" +getFirstPlayer().getCredits());

        if (getSecondPlayer().getCredits() > getFirstPlayer().getCredits()) {
            System.out.println("结果: 恭喜恭喜!");
        }else {
            System.out.println("结果: you are a loser");
        }

    }

    private boolean isNext() {

        System.out.print("是否开始下一轮(y/n):");
        char ch = input.next().charAt(0);

        if (ch == 'y' || ch == 'Y') return true;
        return false;
    }

    private void judgeResultAndShowResult(int myFist, int compFist) {


        int result = win[myFist -1][compFist -1];

        if (result == 1) {
            System.out.println("恭喜, 你赢了");
            getSecondPlayer().setCredits(getSecondPlayer().getCredits() + 1);
        }else if (result == -1) {
            System.out.println("对不起, 你输了");
            getFirstPlayer().setCredits(getFirstPlayer().getCredits() + 1);
        }else {
            System.out.println("真巧,平局");
        }


    }

    private void showMyFist() {

        getSecondPlayer().showFist();

    }

    private boolean isStart() {

        System.out.print("要开始吗?(y/n)");
        char ch = input.next().charAt(0);

        if (ch == 'y' || ch =='Y') return true;
        return false;
    }

    private void showVSInfo() {
        System.out.println(getSecondPlayer().getName() + "\tVS\t" + getFirstPlayer().getName());
    }

    private String readPlayerName() {
        System.out.print("请输入你的名字:");
        return input.next();
    }

    private int selectComupterPlayer() {
        System.out.print("请选择对方角色(1: 刘备 2: 孙权 3: 曹操):");
        int selectPlayerID = input.nextInt();
        return selectPlayerID;

    }

    private void showRule() {

        System.out.println("出拳规则: " + Constant.FIST_RULE);

    }

    public static void main(String[] args) {

        Game game = new Game();
        game.init();
        game.startPlay();
    }

}
