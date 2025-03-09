public class SymmetricMatrix {

    public static void main(String[] args) {
        // Sample symmetric matrix
        int[][] symmetricMatrix = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

        // Sample non-symmetric matrix
        int[][] nonSymmetricMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Check and print if the matrices are symmetric
        System.out.println("Symmetric Matrix is symmetric: " + isSymmetric(symmetricMatrix));
        System.out.println("Non-Symmetric Matrix is symmetric: " + isSymmetric(nonSymmetricMatrix));
    }

    // Method to check if a matrix is symmetric
    public static boolean isSymmetric(int[][] matrix) {
        // Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0) {
            return true; // An empty matrix is considered symmetric
        }

        // Check if the matrix is square (number of rows equals number of columns)
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows != cols) {
            return false; // Non-square matrices cannot be symmetric
        }

        // Check if the matrix is equal to its transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false; // If any element is not equal to its transpose, the matrix is not symmetric
                }
            }
        }

        // If all elements are equal to their transpose, the matrix is symmetric
        return true;
    }
}