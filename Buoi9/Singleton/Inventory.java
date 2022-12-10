package Singleton;

import Entity.Book;

import java.util.ArrayList;

public class Inventory {
    static private ArrayList<Book> inventory = new ArrayList<>();

    private Inventory() {

    }

    static public ArrayList<Book> getInstance() {
        return inventory;
    }

    static public void addInventory(Book book) {
        inventory.add(book);
    }

    static public boolean isValid(int ID) {
        for (Book i : inventory) {
            if (i.getID() == ID) {
                return true;
            }
        }
        return false;
    }

    static public Book getBook(int ID) {
        return inventory.get(ID - 1);
    }

    static public boolean addQuantity(int ID, int quantity) {
        if(!isValid(ID)){
            System.out.println("Không tìm thấy sách");
            return false;
        }
        else{
            getBook(ID).addquantity(quantity);
            return true;
        }
    }
}
