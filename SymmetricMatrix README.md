# Symmetric Matrix Checker (Java)

This Java program checks whether a given 2D integer array is a symmetric matrix.

## Overview

The `SymmetricMatrix` class contains a method `isSymmetric(int[][] matrix)` that determines if a provided 2D array is symmetric. A symmetric matrix is a square matrix that is equal to its transpose.

The `main` method demonstrates the usage of this function with sample symmetric and non-symmetric matrices and prints the results to the console.

## Features

-   Handles null or empty matrices, considering an empty matrix as symmetric.
-   Checks if the matrix is square, returning `false` if it's not.
-   Verifies that each element `matrix[i][j]` is equal to `matrix[j][i]`.
-   Clear and concise code with comments explaining each step.

## Getting Started

### Prerequisites

-   Java Development Kit (JDK) installed on your system.

### Compilation and Execution

1.  **Save the file:** Save the provided Java code as `SymmetricMatrix.java`.

2.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where you saved the file, and compile it using the following command:

    ```bash
    javac SymmetricMatrix.java
    ```

3.  **Run the code:** After successful compilation, execute the program using the following command:

    ```bash
    java SymmetricMatrix
    ```