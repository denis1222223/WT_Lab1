package Project12;

public class Book implements Comparable<Book>{
    public String title;
    public String author;
    public Integer price;
    public static int edition;

    public Integer isbn;

    public Book(String title, String author, int price, int edition) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
        this.isbn = 0;
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
    public Object clone() throws CloneNotSupportedException {
        return new Book(this.title, this.author, this.price, this.edition);
    }

    @Override
    public int compareTo(Book book) {
        return isbn.compareTo(book.isbn);
    }
}
