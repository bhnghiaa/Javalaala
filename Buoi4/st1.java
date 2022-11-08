package Buoi4;

import java.util.Scanner;

public class st1 {

    private String name;
    private int age;
    private String _Class;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public st1() {

    }

    public st1(String name, int age, String _Class, double diemToan, double diemLy, double diemHoa) {
        this.name = name;
        this.age = age;
        this._Class = _Class;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String get_Class() {
        return _Class;
    }

    public void set_Class(String _Class) {
        this._Class = _Class;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void printName() {
        System.out.println();
    }

    public double avg() {
        this.printName();
        return (this.diemToan + this.diemHoa + this.diemLy) / 3;
    }

    public st1 increasePoint() {
        this.diemLy += 3;
        return this;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten, tuoi, lop, diem toan, ly, hoa: ");
        setName(scanner.nextLine());
        setAge(Integer.parseInt(scanner.nextLine()));
        set_Class(scanner.nextLine());
        setDiemToan(Double.parseDouble(scanner.nextLine()));
        setDiemLy(Double.parseDouble(scanner.nextLine()));
        setDiemHoa(Double.parseDouble(scanner.nextLine()));
    }

    public void in() {
        System.out.println("Ten: " + this.getName() + "\n" + "Tuoi: " + this.getAge() + "\n" + "Diem Tb: " + this.avg());

    }
}
