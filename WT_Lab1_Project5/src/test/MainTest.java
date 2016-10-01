import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;

import static Project5.Main.findMinCount;


public class MainTest extends TestCase {
    public void testFindMinCount() throws Exception {
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        Collections.addAll(sequence, 1,2,3,4,3);
        int count = findMinCount(sequence, 0);

        assertEquals(1, count);
    }
}