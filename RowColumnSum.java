public class RowColumnSum {

    public static void main(String[] args) {
        // Sample 2D array
        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Calculate and print row sums
        calculateAndPrintRowSums(myArray);

        // Calculate and print column sums
        calculateAndPrintColumnSums(myArray);
    }

    // Method to calculate and print the sum of each row
    public static void calculateAndPrintRowSums(int[][] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            System.out.println("Array is null or empty. Cannot calculate row sums.");
            return;
        }

        System.out.println("Row Sums:");
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum: " + rowSum);
        }
    }

    // Method to calculate and print the sum of each column
    public static void calculateAndPrintColumnSums(int[][] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            System.out.println("Array is null or empty. Cannot calculate column sums.");
            return;
        }

        System.out.println("\nColumn Sums:");
        for (int j = 0; j < arr[0].length; j++) { // Iterate through columns
            int colSum = 0;
            for (int i = 0; i < arr.length; i++) { // Iterate through rows
                colSum += arr[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum: " + colSum);
        }
    }
}