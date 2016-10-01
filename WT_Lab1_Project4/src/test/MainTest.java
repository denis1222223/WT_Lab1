import junit.framework.TestCase;

import static Project4.Main.findPrimeNumbers;
import static Project4.Main.isPrimeNumber;
import static org.junit.Assert.*;

public class MainTest extends TestCase {

    public void testIsPrimeNumber() throws Exception {
        int number = 13;
        boolean prime = isPrimeNumber(number);
        assertEquals(true, prime);
    }

    public void testIsNotPrimeNumber() throws Exception {
        int number = 44;
        boolean prime = isPrimeNumber(number);
        assertEquals(false, prime);
    }

    public void testFindPrimeNumbers() throws Exception {
        int[] numbers = new int[]{ 1, 3, 4 , 7, 6 };
        int[] primeNumbers = findPrimeNumbers(numbers);
        assertArrayEquals(new int[]{0,1,3}, primeNumbers);
    }
}