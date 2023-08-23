package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */


    public static int diagonalDifference(List<List<Integer>> arr) {
        int size = arr.size();

        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            List<Integer> row = arr.get(i);
            for (int j = 0; j < size; j++) {
                matrix[i][j] = row.get(j);
            }
        }

        int diag1 = 0;
        int diag2 = 0;

        // left to right
        for (int k = 0; k < size; k++) {
            diag1 += matrix[k][k];
        }

        // right to left
        for (int m = 0; m < size; m++) {
            int l = size - 1 - m;
            diag2 += matrix[m][l];
        }

        System.out.println(Arrays.deepToString(matrix));
        return Math.abs(diag1 - diag2);
    }
    // more optimized
    public static int diagonalDifference1(List<List<Integer>> arr) {
        int size = arr.size();
        int leftDiagonal = 0;
        int rightDiagonal = 0;

        for (int i = 0; i < size; i++){
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(i).get(size - 1 - i);
        }

        return Math.abs(leftDiagonal - rightDiagonal);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        arr.add(row1);

        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        arr.add(row2);

        List<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);
        arr.add(row3);

        System.out.println(diagonalDifference(arr));
    }
}
