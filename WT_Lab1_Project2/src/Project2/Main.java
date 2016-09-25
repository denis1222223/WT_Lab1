package Project2;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = getIntegerNumber();
        int y = getIntegerNumber();
        Point point = new Point(x, y);

        Rectangle rect1 = new Rectangle(-4,5,8,5);
        Rectangle rect2 = new Rectangle(-6,0,12,3);

        boolean contains = isContains(point, rect1, rect2);

        System.out.print(contains);
    }

    public static boolean isContains(Point point, Rectangle... rects) {
        for (Rectangle rect: rects) {
            if (rect.contains(point)){
                return true;
            }
        }
        return false;
    }

    public static int getIntegerNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter integer number");
            String inputString = scanner.next();
            try {
                int number = Integer.parseInt(inputString);
                System.out.println("Entered");
                return number;
            } catch (Exception e) { }
        }
    }

}
