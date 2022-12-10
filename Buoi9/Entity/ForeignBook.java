package Entity;

public class ForeignBook extends Book{
    private String ISBN;

    public ForeignBook(String name, String author, int price, int quantity, String ISBN) {
        super(name, author, price, quantity);
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
