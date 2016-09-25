package Project4;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{ 1, 4, 6 , 7, 5, 34, 33, 91, 3, 5 };
        int[] indexes = findPrimeNumbers(numbers);

        printArray(indexes);
    }

    private static void printArray(int[] indexes) {
        for (int i: indexes) {
            System.out.print(i + " ");
        }
    }

    public static int[] findPrimeNumbers(int[] numbers) {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (isPrimeNumber(numbers[i])) {
                indexes.add(i);
            }
        }
        return indexes.stream().mapToInt(i -> i).toArray();
    }

    public static boolean isPrimeNumber(int number) {
        for (int i=2;i<number;i++) {
            if(number%i==0)
                return false;
        }
        return true;
    }
}
