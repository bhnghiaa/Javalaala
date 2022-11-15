package Buoi5;

import java.util.Scanner;

public class Brand {
    private String name;
    public static Scanner scanner = new Scanner(System.in);

    public Brand(String name) {

        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

