import junit.framework.TestCase;

import java.util.Arrays;

import static Project6.Main.getMatrix;
import static Project6.Main.shiftArray;
import static org.junit.Assert.*;

public class MainTest extends TestCase {

    public void testGetMatrix() throws Exception {
        double[] numbers = new double[]{ 1,2,3 };
        double[][] matrix = getMatrix(numbers);
        if (Arrays.equals(new double[][]{{1,2,3},{2,3,1},{3,1,2}}, matrix)){
            throw new Exception();
        }
    }

    public void testShiftArray() throws Exception {
        double[] numbers = new double[]{ 1,2,3 };
        numbers = shiftArray(numbers, 2);
        double test = 0;
        assertArrayEquals(new double[]{3,1,2}, numbers, test);
    }

}