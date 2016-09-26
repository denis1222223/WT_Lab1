import Project12.Book;
import junit.framework.TestCase;
import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class BookTest extends TestCase {

    public void testToString() throws Exception {
        Book book = new Book("Idiot", "F.M.Dostoyevsky", 100, 1868);
        assertEquals("Book Idiot F.M.Dostoyevsky 100 1868", book.toString());
    }

    public void testHashCode() throws Exception {
        Book book = new Book("Idiot", "F.M.Dostoyevsky", 100, 1868);
        assertEquals(3, book.hashCode());
    }

    public void testEquals() throws Exception {
        Book book = new Book("Idiot", "F.M.Dostoyevsky", 100, 1868);
        boolean equal = book.equals( new Book("Idiot", "F.M.Dostoyevsky", 100, 1867) );
        assertEquals(true, equal);
    }

    public void testClone() throws Exception {
        Book book = new Book("Idiot", "F.M.Dostoyevsky", 100, 1868);
        boolean equal = book.equals( book.clone() );
        assertEquals(true, equal);
    }

    public void testComparable() throws Exception {
        Book book1 = new Book("Idiot", "F.M.Dostoyevsky", 100, 1868);
        Book book2 = new Book("Idiot", "F.M.Dostoyevsky", 100, 1868);
        Book book3 = new Book("Idiot", "F.M.Dostoyevsky", 100, 1868);
        book1.isbn = 1; book2.isbn = 3; book3.isbn = 2;

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1); books.add(book2); books.add(book3);
        books.sort(null);

        ArrayList<Book> sortedBooks = new ArrayList<Book>();
        sortedBooks.add(book1); sortedBooks.add(book3); sortedBooks.add(book2);

        if (!booksEquals(books, sortedBooks)){
            throw new Exception();
        }
    }

    private boolean booksEquals(ArrayList<Book> books, ArrayList<Book> sortedBooks) {
        for (int i= 0; i<books.size(); i++){
            if (!books.get(i).equals(sortedBooks.get(i))){
                return false;
            }
        }
        return true;
    }

}