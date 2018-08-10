package Array_String;

import java.util.*;

/**
 * Question:
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
 * column are set to 0.
 */
public class ZeroMatrix {
    private int[][] setZeros(int[][] matrix) {
        // 1st : find all the zero place
        // 2nd: set zeros
        List<int[]> zeros = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) zeros.add(new int[]{i, j});
            }
        }

        for (int[] locations : zeros) {
            int row = locations[0];
            int col = locations[1];

            this.setColZeros(matrix, col);
            this.setRowZeros(matrix, row);

        }

        return matrix;
    }

    private void setRowZeros(int[][] matrix, int num) {
        int colLen = matrix[0].length;
        for (int col = 0; col < colLen; col++) {
            matrix[num][col] = 0;
        }
    }

    private void setColZeros(int[][] matrix, int num) {
        int rowLen = matrix.length;
        for (int row = 0; row < rowLen; row++) {
            matrix[row][num] = 0;
        }
    }

    public static void main(String[] argv) {
        int[][] test = new int[][]{{1, 2, 3}, {4, 0, 0}};
        System.out.println(Arrays.deepToString(new ZeroMatrix().setZeros(test)));
    }

}
