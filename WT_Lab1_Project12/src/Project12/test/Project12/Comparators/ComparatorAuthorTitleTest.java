package Project12.Comparators;

import Project12.Book;
import junit.framework.TestCase;

public class ComparatorAuthorTitleTest extends TestCase {

    public void testCompare() throws Exception {
        Book bookMore = new Book("Idiot", "B", 100, 1868);
        Book bookLess = new Book("Idiot", "A", 100, 1868);

        int compare = new ComparatorAuthorTitle().compare(bookLess, bookMore);
        if (compare > 0){
            throw new Exception();
        }
    }

}