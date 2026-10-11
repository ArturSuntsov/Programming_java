package practice3;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 34, 56, 92},
                {42, 90, 85, 43, 10},
                {45, 12, 67, 34, 23},
                {5, 23, 6, 9, 13},
        };

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length / 2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
                    matrix[i][matrix[i].length - 1 - j] = temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
