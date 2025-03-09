# Search Element in 2D Array (Java)

This Java program demonstrates how to search for a given number in a 2D integer array and print its position if found.

## Overview

The `Search2DArray` class contains a method `searchAndPrintPosition(int[][] arr, int target)` that iterates through a 2D array and searches for a specified target number. If the target number is found, the method prints its row and column position. If not found, it prints a message indicating that the number is not present.

The `main` method demonstrates the usage of this function with a sample 2D array and two target numbers, one that exists and one that does not.

## Features

-   Handles null or empty 2D arrays, printing an error message in such cases.
-   Iterates through the 2D array and searches for the target number.
-   Prints the row and column position of the target number if found.
-   Prints a message if the target number is not found in the array.
-   Clear and concise code with comments explaining each step.

## Getting Started

### Prerequisites

-   Java Development Kit (JDK) installed on your system.

### Compilation and Execution

1.  **Save the file:** Save the provided Java code as `Search2DArray.java`.

2.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where you saved the file, and compile it using the following command:

    ```bash
    javac Search2DArray.java
    ```

3.  **Run the code:** After successful compilation, execute the program using the following command:

    ```bash
    java Search2DArray
    ```