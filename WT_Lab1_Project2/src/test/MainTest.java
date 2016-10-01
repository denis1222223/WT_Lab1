import junit.framework.TestCase;
import java.awt.*;
import static Project2.Main.isContains;

public class MainTest extends TestCase {

    public void testContains() throws Exception {
        Point point = new Point(1, 1);
        Rectangle rect1 = new Rectangle(-4,5,8,5);
        Rectangle rect2 = new Rectangle(-6,0,12,3);

        boolean contains = isContains(point, rect1, rect2);
        assertEquals(true, contains);
    }

    public void testNotContains() throws Exception {
        Point point = new Point(-5, -5);
        Rectangle rect1 = new Rectangle(-4,5,8,5);
        Rectangle rect2 = new Rectangle(-6,0,12,3);

        boolean contains = isContains(point, rect1, rect2);
        assertEquals(false, contains);
    }

}