import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        double x = getRealNumber();
        double y = getRealNumber();
        double answer = MyFunction(x, y);
        System.out.println(answer);
    }

    private static double MyFunction(double x, double y) {
        double numerator = 1 + pow(sin(x + y), 2);
        double denominator = 2 + abs(x - (2*x) / (1 + x*x*y*y));
        return numerator / denominator + x;
    }

    private static double getRealNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter real number");
            String inputString = scanner.next();
            try {
                double number = Double.parseDouble(inputString);
                System.out.println("Entered");
                return number;
            } catch (Exception e) { }
        }
    }

}
