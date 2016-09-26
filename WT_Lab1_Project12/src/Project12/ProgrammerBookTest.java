package Project12;

import junit.framework.TestCase;

public class ProgrammerBookTest extends TestCase {

    public void testToString() throws Exception {
        Book book = new ProgrammerBook("Idiot", "F.M.Dostoyevsky", 100, 1868);
        assertEquals("ProgrammerBook Idiot F.M.Dostoyevsky 100 1868", book.toString());
    }

    public void testHashCode() throws Exception {
        Book book = new ProgrammerBook("Idiot", "F.M.Dostoyevsky", 100, 1868);
        assertEquals(8, book.hashCode());
    }

    public void testEquals() throws Exception {
        Book book = new ProgrammerBook("Idiot", "F.M.Dostoyevsky", 100, 1868);
        boolean equal = book.equals( new Book("Idiot", "F.M.Dostoyevsky", 100, 1867) );
        assertEquals(true, equal);
    }

}