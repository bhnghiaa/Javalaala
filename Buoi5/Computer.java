package Buoi5;

public class Computer {
    private CPU cpu;
    private RAM ram;
    private Mainbroad mainbroad;
    private ID id;
    private int sl;
    private float price;

    public Computer(CPU cpu, RAM ram, Mainbroad mainbroad, ID id, int sl) {
        this.cpu = cpu;
        this.ram = ram;
        this.mainbroad = mainbroad;
        this.id = id;
        this.sl = sl;
        this.price = cpu.getPrice() + ram.getPrice() + mainbroad.getPrice();
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public Mainbroad getMainbroad() {
        return mainbroad;
    }

    public ID getId() {
        return id;
    }

    public int getSl() {
        return sl;
    }

    public float getPrice() {
        return price;
    }
}
