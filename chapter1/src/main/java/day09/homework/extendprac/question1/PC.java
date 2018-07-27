package day09.homework.extendprac.question1;

public class PC extends Computer{

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PC(String color, Device cpu, Device memory, Device hardDisk) {
        setColor(color);
        setCpu(cpu);
        setMemory(memory);
        setHardDisk(hardDisk);
    }


    public void goWeb() {
        System.out.println("开始上网啦");
    }

    @Override
    public String getDetails() {
        return "============PC机器==========\n" +
                super.getDetails() + "color:"+ color +
                "\n============================";
    }
}
