package Entity;

public class ScienceBook extends Book{
    private int year;

    public ScienceBook(String name, String author, int price, int quantity, int year) {
        super(name, author, price, quantity);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
