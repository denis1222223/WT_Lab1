package Project3;
import static java.lang.Math.round;
import static java.lang.Math.tan;

public class Main {

    public static void main(String[] args) {
        double a = 1;
        double b = 10.5;
        double h = 1;

        double[] arguments = generateArguments(a,b,h);
        double[] values = myTangentFunction(arguments);
        printTable(arguments, values);
    }

    public static void printTable(double[] arguments, double[] values) {
        if (arguments.length != values.length){
            return;
        }
        for (int i=0; i<arguments.length; i++){
            System.out.print(arguments[i] + "      ");
            System.out.println(values[i]);
        }
    }

    public static double[] myTangentFunction(double[] arguments) {
        double[] values = new double[arguments.length];
        for (int i=0; i<arguments.length; i++){
            values[i] = tan(arguments[i]);
        }
        return values;
    }

    public static double[] generateArguments(double a, double b, double h) {
        int count = (int)round((b-a) / h);
        double[] arguments = new double[count];
        for (int i=0; i<count; i++){
            arguments[i] = a;
            a += h;
        }
        return arguments;
    }
}
