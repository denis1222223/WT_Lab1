package Project7;

public class Main {

    public static void main(String[] args) {
        double[] numbers = new double[]{ 12,4.9,5,54,765,6.55,7,5,4,3.33};
        numbers = shellSort(numbers);
        printArray(numbers);
    }

    public static double[] shellSort(double[] numbers) {
        int step = numbers.length / 2;
        while (step > 0)
        {
            for (int i = 0; i < (numbers.length - step); i++)
            {
                int j = i;
                while (j >= 0 && numbers[j] > numbers[j + step])
                {
                    double temp = numbers[j];
                    numbers[j] = numbers[j + step];
                    numbers[j + step] = temp;
                    j--;
                }
            }
            step = step / 2;
        }
        return numbers;
    }

    private static void printArray(double[] row) {
        for (double i: row) {
            System.out.print(i + " ");
        }
    }
}
