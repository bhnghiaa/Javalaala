package Singleton;

import Entity.Book;

import java.util.HashMap;

public class Cart {
    static private HashMap<Integer, Integer> cart = new HashMap<>();

    private Cart() {

    }

    static public HashMap<Integer, Integer> getInstace() {
        return cart;
    }

    static public boolean addTocart(int ID, int quantity) {
        if (!Inventory.isValid(ID)) return false;
        Book temp = Inventory.getBook(ID);
        if (quantity > temp.getQuantity()) {
            return false;
        } else {
            temp.setQuantity(temp.getQuantity() - quantity);
        }
        if (cart.containsKey(ID)) {
            cart.put(ID, quantity + cart.get(ID));
        } else {
            cart.put(ID, quantity);
        }
        return true;
    }
}
