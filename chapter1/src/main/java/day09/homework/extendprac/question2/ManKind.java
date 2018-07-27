package day09.homework.extendprac.question2;

public class ManKind {

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

     int sex;
     int salary;


    public ManKind() {

    }

    public ManKind(int sex, int salary) {
        setSex(sex);
        setSalary(salary);
    }

    public void manOrWoman() {

        if (1 == sex) {
            System.out.println("man");
        }

        if (0 == sex) {
            System.out.println("women");
        }
    }

    public void employeed() {

        if (0 == salary) {
            System.out.println("no job");
        }

        if (0 != salary) {
            System.out.println("job");
        }

    }

}
