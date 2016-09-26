package Project12.Comparators;
import Project12.Book;
import java.util.Comparator;

public class ComparatorAuthorTitle implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int authorCompare = b1.author.compareTo(b2.author);
        if (authorCompare != 0){
            return authorCompare;
        } else {
            return b1.title.compareTo(b2.title);
        }
    }
}