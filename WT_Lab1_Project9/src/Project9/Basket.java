package Project9;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;

    public Basket(){
        balls = new ArrayList<Ball>();
    }

    public void add(Ball ball){
        balls.add(ball);
    }

    public int getWeight() {
        int weight = 0;
        for (Ball ball: balls) {
            weight += ball.weight;
        }
        return weight;
    }

    public int getCountOfColor(String color){
        int count = 0;
        for (Ball ball: balls) {
            if (ball.color == color)
                count += 1;
        }
        return count;
    }
}
