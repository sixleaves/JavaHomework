package day08.homework.methodExec;

public class IntergerSum {


    public static int calc(int...a) {

        int sum = 0;

        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }

    public static double calc(double...a) {

        double sum = 0;

        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(calc(3,2));
        System.out.println(calc(3,2,3));

        System.out.println(calc(3.0,2.0,3.0));

        System.out.println(calc(3.0,2.0,3.0,4.0));


    }

}
