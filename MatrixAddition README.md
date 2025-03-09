# Matrix Addition (Java)

This Java program demonstrates how to add two matrices and store the result in another 2D array.

## Overview

The `MatrixAddition` class contains two primary methods:

-   `addMatrices(int[][] matrix1, int[][] matrix2)`: This method adds two given matrices and returns the resulting sum matrix.
-   `printMatrix(int[][] matrix)`: This method prints the elements of a given matrix to the console.

The `main` method demonstrates the usage of these functions with sample matrices and prints the original matrices and their sum.

## Features

-   Handles null or empty matrices, returning an empty matrix in such cases.
-   Checks if the matrices have the same dimensions, returning an empty matrix and printing an error message if they don't.
-   Performs element-wise addition of the matrices.
-   Provides a utility method to print matrices in a readable format.
-   Clear and concise code with comments explaining each step.

## Getting Started

### Prerequisites

-   Java Development Kit (JDK) installed on your system.

### Compilation and Execution

1.  **Save the file:** Save the provided Java code as `MatrixAddition.java`.

2.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where you saved the file, and compile it using the following command:

    ```bash
    javac MatrixAddition.java
    ```

3.  **Run the code:** After successful compilation, execute the program using the following command:

    ```bash
    java MatrixAddition
    ```