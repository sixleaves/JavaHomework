package day09.homework.extendprac.question1;
/*
*
* 1.编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法用于返回Computer的详细信息
编写PC子类，继承Computer类，添加特有属性和方法
编写NotePad子类，继承Computer类，添加特有属性和方法
编写Test类，在main方法中创建PC和NotePad对象，分别访问对象中特有的属性、方法，以及从Computer类继承的属性和方法并打印输出。

进阶：将Computer类的属性改为私有的，试着再去调用
*
* */
public class Computer {

    private Device cpu;
    private Device memory;
    private Device hardDisk;

    // 构造方法
    public Computer() {

    }

    public Computer(Device cpu, Device memory ,Device hardDisk) {

        setCpu(cpu);
        setMemory(memory);
        setHardDisk(hardDisk);
    }

    public String getDetails() {
        return cpu + "\n" + memory + "\n" + hardDisk + "\n";
    }

    // setter and getter

    public Device getCpu() {
        return cpu;
    }

    public void setCpu(Device cpu) {
        this.cpu = cpu;
    }

    public Device getMemory() {
        return memory;
    }

    public void setMemory(Device memory) {
        this.memory = memory;
    }

    public Device getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(Device hardDisk) {
        this.hardDisk = hardDisk;
    }


}

class Device {

    public Device(String name, long size, String unit) {
        setName(name);
        setSize(size);
        setUnit(unit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    private String name;    // 设备名
    private long size;      // 大小
    private String unit;    // 单位

    @Override
    public String toString() {
        return "硬件名:" + name + "的规格:" + size + " " + unit;
    }
}


