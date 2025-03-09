# Find Min and Max in a 2D Array (Java)

This Java program finds the largest and smallest elements within a given 2D integer array.

## Overview

The `FindMinMax2DArray` class contains two primary methods:

-   `findLargest(int[][] arr)`: This method iterates through the 2D array and returns the largest integer found.
-   `findSmallest(int[][] arr)`: This method iterates through the 2D array and returns the smallest integer found.

The `main` method demonstrates the usage of these functions with a sample 2D array and prints the results to the console.

## Features

-   Handles null or empty 2D arrays, returning `Integer.MIN_VALUE` for `findLargest` and `Integer.MAX_VALUE` for `findSmallest` in such cases.
-   Efficiently iterates through the 2D array to find the minimum and maximum elements.
-   Clear and concise code with comments explaining each step.

## Getting Started

### Prerequisites

-   Java Development Kit (JDK) installed on your system.

### Compilation and Execution

1.  **Save the file:** Save the provided Java code as `FindMinMax2DArray.java`.

2.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where you saved the file, and compile it using the following command:

    ```bash
    javac FindMinMax2DArray.java
    ```

3.  **Run the code:** After successful compilation, execute the program using the following command:

    ```bash
    java FindMinMax2DArray
    ```