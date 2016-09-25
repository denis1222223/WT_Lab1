package Project3;
import junit.framework.TestCase;

import static Project3.Main.generateArguments;
import static Project3.Main.myTangentFunction;
import static java.lang.Math.PI;
import static java.lang.StrictMath.tan;
import static org.junit.Assert.*;

public class MainTest extends TestCase {

    public void testMyTangentFunction() throws Exception {
        double[] args = { 0, PI, 34 };
        double[] values = myTangentFunction(args);

        double test = 0;
        assertArrayEquals(new double[]{0, tan(PI), tan(34)}, values, test);
    }

    public void testGenerateArguments() throws Exception {
        double a = 1;
        double b = 2.4;
        double h = 0.5;

        double[] arguments = generateArguments(a,b,h);
        double test = 0;
        assertArrayEquals(new double[]{1, 1.5, 2}, arguments, test);
    }

}