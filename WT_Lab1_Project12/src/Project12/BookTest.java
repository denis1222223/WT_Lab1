package Project12;

import junit.framework.TestCase;


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

}