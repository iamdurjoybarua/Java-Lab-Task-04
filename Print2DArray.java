public class Print2DArray {

    public static void main(String[] args) {
        // Sample 2D array
        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        // Call the method to print the 2D array
        print2DArray(myArray);
    }

    // Method to print all elements of a 2D array
    public static void print2DArray(int[][] arr) {

        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            System.out.println("The 2D array is null or empty.");
            return; // Exit the method if the array is null or empty
        }

        // Iterate through the rows of the 2D array
        for (int i = 0; i < arr.length; i++) {

            // Iterate through the columns of the current row
            for (int j = 0; j < arr[i].length; j++) {
                // Print the element at the current row and column
                System.out.print(arr[i][j] + " ");
            }
            // Move to the next line after printing all elements of a row
            System.out.println();
        }
    }
}