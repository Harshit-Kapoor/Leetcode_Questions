class Solution {
    public static void rotate(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // First, find the transpose

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) { // Notice `j = i + 1` to avoid redundant swaps
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("Matrix Transpose = ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < rows; i++) {

            int colPointer = cols - 1;

            for (int j = 0; j < cols / 2; j++) {

                 int temp = matrix[i][j];
                 matrix[i][j] = matrix[i][colPointer];
                 matrix[i][colPointer] = temp;
                 colPointer--;

            }
        }

        System.out.println("Reverse Horizontally = ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}