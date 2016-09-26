package Project12.Comparators;
import Project12.Book;
import java.util.Comparator;

public class ComparatorAuthorTitlePrice implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int authorCompare = b1.author.compareTo(b2.author);
        if (authorCompare != 0){
            return authorCompare;
        } else {
            int titleCompare = b1.title.compareTo(b2.title);
            if (titleCompare != 0){
                return titleCompare;
            } else {
                return b1.price.compareTo(b2.price);
            }
        }
    }
}