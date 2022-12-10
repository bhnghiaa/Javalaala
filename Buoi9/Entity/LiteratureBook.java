package Entity;

public class LiteratureBook extends Book {
    private int numberofPeprinted;

    public LiteratureBook(String name, String author, int price, int quantity, int numberofPeprinted) {
        super(name, author, price, quantity);
        this.numberofPeprinted = numberofPeprinted;
    }

    public int getNumberofPeprinted() {
        return numberofPeprinted;
    }

    public void setNumberofPeprinted(int numberofPeprinted) {
        this.numberofPeprinted = numberofPeprinted;
    }
}
