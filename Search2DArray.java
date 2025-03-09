public class Search2DArray {

    public static void main(String[] args) {
        // Sample 2D array
        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Number to search for
        int targetNumber = 5;

        // Search for the number and print its position
        searchAndPrintPosition(myArray, targetNumber);

        //search for a number that does not exist.
        targetNumber = 10;
        searchAndPrintPosition(myArray, targetNumber);
    }

    // Method to search for a number in a 2D array and print its position
    public static void searchAndPrintPosition(int[][] arr, int target) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            System.out.println("Array is null or empty.");
            return;
        }

        // Iterate through the rows of the 2D array
        for (int i = 0; i < arr.length; i++) {
            // Iterate through the columns of the current row
            for (int j = 0; j < arr[i].length; j++) {
                // Check if the current element matches the target number
                if (arr[i][j] == target) {
                    // Print the position of the target number
                    System.out.println("Target number " + target + " found at position: row " + i + ", column " + j);
                    return; // Exit the method after finding the target
                }
            }
        }

        // If the target number is not found, print a message
        System.out.println("Target number " + target + " not found in the array.");
    }
}