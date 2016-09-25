package Project9;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add(new Ball("blue", 1));
        basket.add(new Ball("blue", 1));
        basket.add(new Ball("blue", 1));
        basket.add(new Ball("red", 2));

        int weight = basket.getWeight();
        int countBlue = basket.getCountOfColor("blue");

        System.out.println(weight);
        System.out.println(countBlue);
    }
}
