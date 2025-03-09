# Matrix Multiplication (Java)

This Java program demonstrates how to multiply two matrices and store the result in another 2D array.

## Overview

The `MatrixMultiplication` class contains two primary methods:

-   `multiplyMatrices(int[][] matrix1, int[][] matrix2)`: This method multiplies two given matrices and returns the resulting product matrix.
-   `printMatrix(int[][] matrix)`: This method prints the elements of a given matrix to the console.

The `main` method demonstrates the usage of these functions with sample matrices and prints the original matrices and their product.

## Features

-   Handles null or empty matrices, returning an empty matrix in such cases.
-   Checks if the matrices can be multiplied (number of columns in the first matrix must equal the number of rows in the second matrix), returning an empty matrix and printing an error message if they can't.
-   Performs matrix multiplication according to the standard algorithm.
-   Provides a utility method to print matrices in a readable format.
-   Clear and concise code with comments explaining each step.

## Getting Started

### Prerequisites

-   Java Development Kit (JDK) installed on your system.

### Compilation and Execution

1.  **Save the file:** Save the provided Java code as `MatrixMultiplication.java`.

2.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where you saved the file, and compile it using the following command:

    ```bash
    javac MatrixMultiplication.java
    ```

3.  **Run the code:** After successful compilation, execute the program using the following command:

    ```bash
    java MatrixMultiplication
    ```