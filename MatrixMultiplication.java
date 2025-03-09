public class MatrixMultiplication {

    public static void main(String[] args) {
        // Sample matrices
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrix2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        // Multiply the matrices and store the result
        int[][] productMatrix = multiplyMatrices(matrix1, matrix2);

        // Print the original matrices and the product matrix
        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);

        System.out.println("\nProduct Matrix:");
        printMatrix(productMatrix);
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        // Check if matrices are null or empty
        if (matrix1 == null || matrix2 == null || matrix1.length == 0 || matrix2.length == 0) {
            return new int[0][0]; // Return an empty matrix if input is invalid
        }

        // Check if matrices can be multiplied (number of columns in matrix1 must equal number of rows in matrix2)
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied. Incompatible dimensions.");
            return new int[0][0]; // Return an empty matrix if dimensions are incompatible
        }

        // Create a new matrix to store the product
        int[][] productMatrix = new int[rows1][cols2];

        // Multiply the matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Return the product matrix
        return productMatrix;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        // Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0) {
            System.out.println("Matrix is null or empty.");
            return;
        }

        // Iterate through the rows and columns and print each element
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}