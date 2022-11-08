package Buoi4;

import java.util.ArrayList;
import java.util.Scanner;

public class students_Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<st1> students = new ArrayList<>();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            st1 student = new st1();
            student.nhap();
            students.add(student);
        }
        for (int i = 0; i < n; i++) {
            students.get(i).in();
        }
    }

}