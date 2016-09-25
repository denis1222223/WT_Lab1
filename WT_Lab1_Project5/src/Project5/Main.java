package Project5;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        Collections.addAll(sequence, 3, 4, 2, 7, 1, 8, 5, 10, 9);

        int count = findMinCount(sequence, 0);
        System.out.println(count);

        printArray(sequence);
    }

    private static void printArray(ArrayList<Integer> indexes) {
        for (int i: indexes) {
            System.out.print(i + " ");
        }
    }

    public static int findMinCount(ArrayList<Integer> sequence, int count) {
        for (int i = 0; i < sequence.size()-1; i++){
            if (sequence.get(i) > sequence.get(i+1)){
                count++;
                sequence.remove(i+1);
                return findMinCount(sequence, count);
            }
        }
        return count;
    }
}
