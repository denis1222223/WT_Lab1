package Project8;

import junit.framework.TestCase;
import static Project8.Main.concatIncreasingSequences;
import static org.junit.Assert.*;

public class MainTest extends TestCase {
    public void testConcatIncreasingSequences() throws Exception {
        int[] firstSeq = {3, 99};
        int[] secondSeq = {1, 2, 8};
        int[] result = concatIncreasingSequences(firstSeq, secondSeq);
        assertArrayEquals(new int[]{1, 2, 3, 8, 99}, result);
    }

}