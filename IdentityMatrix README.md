# Identity Matrix Checker (Java)

This Java program checks whether a given 2D integer array is an identity matrix.

## Overview

The `IdentityMatrix` class contains a method `isIdentityMatrix(int[][] matrix)` that determines if a provided 2D array is an identity matrix. An identity matrix is a square matrix in which all the elements of the principal diagonal are ones and all other elements are zeros.

The `main` method demonstrates the usage of this function with sample identity and non-identity matrices and prints the results to the console.

## Features

-   Handles null or empty matrices, returning `false` in such cases.
-   Checks if the matrix is square, returning `false` if it's not.
-   Verifies that diagonal elements are 1 and non-diagonal elements are 0.
-   Clear and concise code with comments explaining each step.

## Getting Started

### Prerequisites

-   Java Development Kit (JDK) installed on your system.

### Compilation and Execution

1.  **Save the file:** Save the provided Java code as `IdentityMatrix.java`.

2.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where you saved the file, and compile it using the following command:

    ```bash
    javac IdentityMatrix.java
    ```

3.  **Run the code:** After successful compilation, execute the program using the following command:

    ```bash
    java IdentityMatrix
    ```