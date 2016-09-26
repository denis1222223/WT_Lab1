package Project12;

public class Book {
    protected String title;
    protected String author;
    protected int price;
    protected static int edition;

    public Book(String title, String author, int price, int edition) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Book " + title + " " + author + " " + price + " " + edition;
    }

    @Override
    public int hashCode() {
        return (price + edition) % 5;
    }

    @Override
    public boolean equals(Object obj) {
        if ((this.price == ((Book)obj).price) &&
            (this.author == ((Book)obj).author) &&
            (this.title == ((Book)obj).title)) {
            return true;
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Book(this.title, this.author, this.price, this.edition);
    }
}
