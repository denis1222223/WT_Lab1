package Project8;

public class Main {

    public static void main(String[] args) {
        int[] firstSeq = {3, 4, 8 , 89, 454};
        int[] secondSeq = {1, 22, 8};
        int[] result = concatIncreasingSequences(firstSeq, secondSeq);
        printSequence(result);
    }

    public static int[] concatIncreasingSequences(int[] firstSeq, int[] secondSeq){
        if (firstSeq == null || secondSeq == null) return  null;
        int[] newSequence = new int[firstSeq.length + secondSeq.length];
        int i = 0, j = 0;
        for (int z = 0; z <= firstSeq.length + secondSeq.length - 1; z++){
            if (i >= firstSeq.length){
                newSequence[z] = secondSeq[j];
                j++;
                continue;
            }
            if (j >= secondSeq.length){
                newSequence[z] = firstSeq[i];
                i++;
                continue;
            }
            if (firstSeq[i] >= secondSeq[j]) {
                newSequence[z] = secondSeq[j];
                j++;
            }
            else {
                newSequence[z] = firstSeq[i];
                i++;
            }
        }

        return newSequence;
    }
    public static void printSequence(int[] sequence) {
        for (int item : sequence){
            System.out.print(" " + item);
        }
    }
}
