public class Sum2DArray {

    public static void main(String[] args) {
        // Sample 2D array
        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Calculate and print the sum of all elements
        int sum = calculateSum(myArray);
        System.out.println("Sum of all elements: " + sum);
    }

    // Method to calculate the sum of all elements in a 2D array
    public static int calculateSum(int[][] arr) {
        // Initialize the sum to 0
        int sum = 0;

        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return 0; // Return 0 if the array is null or empty
        }

        // Iterate through the rows of the 2D array
        for (int i = 0; i < arr.length; i++) {
            // Iterate through the columns of the current row
            for (int j = 0; j < arr[i].length; j++) {
                // Add the current element to the sum
                sum += arr[i][j];
            }
        }

        // Return the calculated sum
        return sum;
    }
}