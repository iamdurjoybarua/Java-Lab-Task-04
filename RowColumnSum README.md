# Row and Column Sums of a 2D Array (Java)

This Java program calculates and prints the sum of each row and each column in a given 2D integer array.

## Overview

The `RowColumnSum` class contains two primary methods:

-   `calculateAndPrintRowSums(int[][] arr)`: This method calculates and prints the sum of each row in the given 2D array.
-   `calculateAndPrintColumnSums(int[][] arr)`: This method calculates and prints the sum of each column in the given 2D array.

The `main` method demonstrates the usage of these functions with a sample 2D array.

## Features

-   Handles null or empty 2D arrays, printing an error message in such cases.
-   Calculates and prints the sum of each row, labeling each row with its index (starting from 1).
-   Calculates and prints the sum of each column, labeling each column with its index (starting from 1).
-   Clear and concise code with comments explaining each step.

## Getting Started

### Prerequisites

-   Java Development Kit (JDK) installed on your system.

### Compilation and Execution

1.  **Save the file:** Save the provided Java code as `RowColumnSum.java`.

2.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where you saved the file, and compile it using the following command:

    ```bash
    javac RowColumnSum.java
    ```

3.  **Run the code:** After successful compilation, execute the program using the following command:

    ```bash
    java RowColumnSum
    ```