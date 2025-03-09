public class MatrixAddition {

    public static void main(String[] args) {
        // Sample matrices
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrix2 = {
                {7, 8, 9},
                {10, 11, 12}
        };

        // Add the matrices and store the result
        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        // Print the original matrices and the sum matrix
        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);

        System.out.println("\nSum Matrix:");
        printMatrix(sumMatrix);
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Check if matrices are null or empty
        if (matrix1 == null || matrix2 == null || matrix1.length == 0 || matrix2.length == 0) {
            return new int[0][0]; // Return an empty matrix if input is invalid
        }

        // Check if matrices have the same dimensions
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return new int[0][0]; // Return an empty matrix if dimensions don't match
        }

        // Create a new matrix to store the sum
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sumMatrix = new int[rows][cols];

        // Add the corresponding elements of the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Return the sum matrix
        return sumMatrix;
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