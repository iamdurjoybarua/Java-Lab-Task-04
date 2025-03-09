public class IdentityMatrix {

    public static void main(String[] args) {
        // Sample identity matrix
        int[][] identityMatrix = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        // Sample non-identity matrix
        int[][] nonIdentityMatrix = {
                {1, 2, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        // Check and print if the matrices are identity matrices
        System.out.println("Identity Matrix is an identity matrix: " + isIdentityMatrix(identityMatrix));
        System.out.println("Non-Identity Matrix is an identity matrix: " + isIdentityMatrix(nonIdentityMatrix));
    }

    // Method to check if a matrix is an identity matrix
    public static boolean isIdentityMatrix(int[][] matrix) {
        // Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0) {
            return false; // An empty matrix is not an identity matrix
        }

        // Check if the matrix is square (number of rows equals number of columns)
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows != cols) {
            return false; // Non-square matrices cannot be identity matrices
        }

        // Check if diagonal elements are 1 and others are 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) { // Diagonal elements
                    if (matrix[i][j] != 1) {
                        return false; // Diagonal element is not 1
                    }
                } else { // Non-diagonal elements
                    if (matrix[i][j] != 0) {
                        return false; // Non-diagonal element is not 0
                    }
                }
            }
        }

        // If all diagonal elements are 1 and others are 0, the matrix is an identity matrix
        return true;
    }
}