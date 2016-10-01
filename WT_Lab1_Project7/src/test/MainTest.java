import junit.framework.TestCase;
import static org.junit.Assert.*;
import static Project7.Main.shellSort;


public class MainTest extends TestCase {

    public void testShellSort() throws Exception {
        double[] numbers = new double[]{ 3,2,4,-1 };
        numbers = shellSort(numbers);
        double test = 0;
        assertArrayEquals(new double[]{-1,2,3,4}, numbers, test);
    }

}