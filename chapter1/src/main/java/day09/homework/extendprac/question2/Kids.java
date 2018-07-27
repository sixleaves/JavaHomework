package day09.homework.extendprac.question2;

public class Kids extends ManKind{

    private int yearsOld;

    public void printAge() {
        System.out.println("年龄:" + yearsOld);
    }


    public static void main(String[] args) {

        Kids kids = new Kids();

        kids.setSalary(1000);
        kids.setSex(1);

        kids.manOrWoman();
        kids.employeed();

        kids.salary = 0;
        kids.yearsOld = 20;
        kids.sex = 1;
        kids.manOrWoman();
        kids.employeed();



    }


}
