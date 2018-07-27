package day09.homework.extendprac.question1;

public class Test {

    public static void main(String[] args) {

        Device cpu = new Device("cpu", 3000, "HZ");
        Device memory = new Device("内存", 8, "GB");
        Device harDisk = new Device("硬盘", 1, "TB");
        Computer pc = new PC("红色", cpu, memory, harDisk);
        System.out.println(pc.getDetails());

        Device cpu1 = new Device("cpu", 3000, "HZ");
        Device memory1 = new Device("内存", 4, "GB");
        Device harDisk1 = new Device("硬盘", 258, "GB");
        Device pen = new Device("电子笔", 15, "CM");
        NotePad notePad = new NotePad(pen, cpu1, memory1, harDisk1);
        System.out.println(notePad
        .getDetails());



    }
}
