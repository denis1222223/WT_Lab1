package Project12;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price, int edition) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
    }

    @Override
    public String toString() {
        return title + " " + author + " " + price + " " + edition;
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
}
