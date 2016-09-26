package Project12.Comparators;
import Project12.Book;
import java.util.Comparator;

public class ComparatorTitleAuthor implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int titleCompare = b1.title.compareTo(b2.title);
        if (titleCompare != 0){
            return titleCompare;
        } else {
            return b1.author.compareTo(b2.author);
        }
    }
}