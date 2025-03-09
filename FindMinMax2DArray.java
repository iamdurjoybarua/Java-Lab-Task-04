public class FindMinMax2DArray {

    public static void main(String[] args) {
        // Sample 2D array
        int[][] myArray = {
                {10, 5, 20},
                {30, 15, 8},
                {25, 40, 1}
        };

        // Find the largest and smallest elements
        int largest = findLargest(myArray);
        int smallest = findSmallest(myArray);

        // Print the results
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }

    // Method to find the largest element in a 2D array
    public static int findLargest(int[][] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            System.out.println("Array is null or empty.");
            return Integer.MIN_VALUE; // Return the smallest possible integer value in case of an error
        }

        // Initialize the largest element with the first element of the array
        int largest = arr[0][0];

        // Iterate through the rows of the 2D array
        for (int i = 0; i < arr.length; i++) {
            // Iterate through the columns of the current row
            for (int j = 0; j < arr[i].length; j++) {
                // Check if the current element is larger than the current largest
                if (arr[i][j] > largest) {
                    // Update the largest element
                    largest = arr[i][j];
                }
            }
        }

        // Return the largest element
        return largest;
    }

    // Method to find the smallest element in a 2D array
    public static int findSmallest(int[][] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            System.out.println("Array is null or empty.");
            return Integer.MAX_VALUE; // Return the largest possible integer value in case of an error
        }

        // Initialize the smallest element with the first element of the array
        int smallest = arr[0][0];

        // Iterate through the rows of the 2D array
        for (int i = 0; i < arr.length; i++) {
            // Iterate through the columns of the current row
            for (int j = 0; j < arr[i].length; j++) {
                // Check if the current element is smaller than the current smallest
                if (arr[i][j] < smallest) {
                    // Update the smallest element
                    smallest = arr[i][j];
                }
            }
        }

        // Return the smallest element
        return smallest;
    }
}