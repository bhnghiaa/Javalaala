package Buoi5;

import java.util.Scanner;

public class Mainbroad {
    public static Scanner scanner = new Scanner(System.in);
    private ID id;
    private String name;
    private Brand brand;
    private float price;

    public Mainbroad(ID id, String name, Brand brand, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
