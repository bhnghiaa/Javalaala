import Entity.Book;
import Entity.ForeignBook;
import Entity.LiteratureBook;
import Entity.ScienceBook;
import Singleton.Cart;
import Singleton.Inventory;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void greeting(){
        System.out.println("***********************************");
        System.out.println("*****Welcome to the Book Store*****");
        System.out.println("***********************************");
        System.out.println("\n" + "How can i help you, sir/miss ?");
    }

    public static void options(){
        System.out.println("\nSelect these options:");
        System.out.println("1. In ra thông tin sách trong kho");
        System.out.println("2. Thêm sách vào trong kho ");
        System.out.println("3. Thêm sách vào giỏ hàng của bạn");
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Inventory.addInventory(new ScienceBook("Insectpedia: A Brief Compendium of Insect Lore", "Eric. R. Eaton", 65000, 8, 1998));
        Inventory.addInventory(new ScienceBook("Project Hail Mary", "Andy Weir", 70000, 8, 2003));
        Inventory.addInventory(new LiteratureBook("To Kill a Mockingbird", "Harper Lee", 33000, 15, 12));
        Inventory.addInventory(new LiteratureBook("A Passage to India", "E. M. Forster", 40000, 3, 20));
        Inventory.addInventory(new ForeignBook("The Alchemist","Paulo Coelho", 20000, 20, "012345678"));
        Inventory.addInventory(new ForeignBook("Blindness", "José Saramago", 100000, 15, "024681012"));

        ArrayList<Book> ls = Inventory.getInstance();

        int choice;
        greeting();
        while(true){
            options();
            choice = sc.nextInt();
            switch(choice) {

                case 1:	{
                    for (Book i : ls) {
                        System.out.println(i.toString());
                    }
                    break;
                }

                case 2:{
                    int n, id, quant;
                    System.out.println("Nhập vào số lần bạn muốn thêm sách vào kho: ");
                    n = sc.nextInt();

                    for (int i = 1; i <= n; i++) {
                        System.out.println("Mời bạn nhập Id sách và số lượng muốn thêm vào kho: ");
                        System.out.print("ID: ");
                        id = sc.nextInt();
                        System.out.print("Số lượng: ");
                        quant = sc.nextInt();
                        if (Inventory.addQuantity(id, quant)) System.out.println("Sách đã được thêm vào kho !!!");
                        else System.out.println("Sách không thể được thêm vào kho !!!");
                    }
                    break;
                }

                case 3:{
                    int n, id, quant;
                    System.out.println("Nhập vào số lần bạn muốn thêm sách vào giỏ hàng : ");
                    n = sc.nextInt();

                    for (int i=1; i<=n; i++) {
                        System.out.println("Mời bạn nhập Id sách và số lượng muốn thêm vào kho: ");
                        System.out.print("ID: ");
                        id = sc.nextInt();
                        System.out.print("Số lượng: ");
                        quant = sc.nextInt();

                        if(Cart.addTocart(id, quant)) {
                            System.out.println("Sách đã thêm vào giỏ hàng của bạn");
                        }
                        else System.out.println("Không thể thêm sách vào giỏ hàng của bạn ");
                    }
                    break;
                }
            }

        }
    }
}