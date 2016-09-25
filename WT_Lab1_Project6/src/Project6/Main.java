package Project6;

public class Main {

    public static void main(String[] args) {
        double[] numbers = new double[]{ 12,4.9,5,54,765,6.55,7,5,4,3.33,42,6,45,455,756 };
        double[][] matrix = getMatrix(numbers);
        printMatrix(matrix);
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row: matrix) {
            for (double item: row) {
                System.out.format("%6.2f   ", item);
            }
            System.out.println();
        }
    }

    public static double[][] getMatrix(double[] numbers) {
        int size = numbers.length;
        double[][] matrix = new double[size][size];
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                matrix[i][j] = numbers[j];
            }
            numbers = shiftArray(numbers, 2);
        }
        return matrix;
    }

    public static double[] shiftArray(double[] numbers, int shift) {
        int size = numbers.length;
        double[] newArray = new double[size];
        for (int i = 0; i<size; i++){
            newArray[i] = numbers[(i+shift)%size];
        }
        return newArray;
    }
}
