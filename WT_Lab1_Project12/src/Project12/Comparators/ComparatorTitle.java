package Project12.Comparators;
import Project12.Book;
import java.util.Comparator;

public class ComparatorTitle implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.title.compareTo(b2.title);
    }
}
