package Project9;

import junit.framework.TestCase;

public class BasketTest extends TestCase {

    public void testGetWeight() throws Exception {
        Basket basket = new Basket();
        basket.add(new Ball("blue", 1));
        basket.add(new Ball("blue", 1));

        int weight = basket.getWeight();
        assertEquals(weight, 2);
    }

    public void testGetCountOfColor() throws Exception {
        Basket basket = new Basket();
        basket.add(new Ball("blue", 1));
        basket.add(new Ball("red", 1));

        int count = basket.getCountOfColor("red");
        assertEquals(count, 1);
    }

}