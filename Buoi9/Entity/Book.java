package Entity;

public class Book {
    private int ID;
    private String name;
    private String author;
    private int price;
    private int quantity;
    static private int count;

    public Book(String name, String author, int price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.ID = ++count;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addquantity(int quantity) {
        this.quantity += quantity;
    }

    public String toString() {
        return "Name: " + this.getName() +
                " Author: " + this.getAuthor()
                + " Quantity " + this.getQuantity()
                + " Price: " + this.getPrice() + " USD" ;
    }
}


