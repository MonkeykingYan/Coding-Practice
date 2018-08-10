package Array_String;

import java.util.Arrays;

/**
 * Question:
 * Given an image represented by an NxN matrix, where each pixel in the image is 4
 * bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 * <p>
 * Given input matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * rotate the input matrix in-place such that it becomes:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 */
public class RotateMatrix {
    // The row to change to the column

    private int[][] rotate(int[][] image) {
        int[][] res = new int[image.length][image.length];
        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image.length; col++) {
                res[row][col] = image[image.length - col - 1][row];
            }
        }
        return res;
    }

    public static void main(String[] argv) {
        int[][] test = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(new RotateMatrix().rotate(test)));
    }
}
