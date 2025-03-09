public class TransposeMatrix {

    public static void main(String[] args) {
        // Sample 2D array (matrix)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Calculate and print the transpose of the matrix
        int[][] transposedMatrix = transpose(matrix);

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Print the transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transposedMatrix);
    }

    // Method to calculate the transpose of a matrix
    public static int[][] transpose(int[][] matrix) {
        // Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0) {
            return new int[0][0]; // Return an empty matrix if the input is invalid
        }

        // Get the number of rows and columns of the original matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create a new matrix to store the transpose, with swapped dimensions
        int[][] transposedMatrix = new int[cols][rows];

        // Iterate through the original matrix and populate the transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j]; // Swap row and column indices
            }
        }

        // Return the transposed matrix
        return transposedMatrix;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        // Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0) {
            System.out.println("Matrix is null or empty.");
            return;
        }

        // Iterate through the rows and columns of the matrix and print each element
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}