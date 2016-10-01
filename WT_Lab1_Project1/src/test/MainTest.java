import junit.framework.TestCase;
import static Project1.Main.*;

public class MainTest extends TestCase {

    public void testMyFunction() throws Exception {
        double x = 0;
        double y = 0;
        double z = myFunction(x, y);
        assertEquals(0.5, z);
    }

}