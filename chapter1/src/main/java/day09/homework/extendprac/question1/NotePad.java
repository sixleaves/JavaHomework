package day09.homework.extendprac.question1;

public class NotePad extends Computer{



    private Device pen;  // 电子笔


    public NotePad() {

    }

    public NotePad(Device pen, Device cpu, Device memory, Device hardDisk) {
        setPen(pen);
        setCpu(cpu);
        setMemory(memory);
        setHardDisk(hardDisk);
    }

    public Device getPen() {
        return pen;
    }

    public void setPen(Device pen) {
        this.pen = pen;
    }


    @Override
    public String getDetails() {
        return "============NotePad==========\n" +
                super.getDetails() +
                pen +
                "\n==========================\n";
    }
}
