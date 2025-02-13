Sorting Algorithms Performance Analysis

This repository contains Java implementations of three sorting algorithms: Bubble Sort, Selection Sort, and Insertion Sort. The purpose of this lab is to analyze their performance by calculating the number of operations (step counts) for best-case, worst-case, and average-case scenarios.

Lab Overview

In this lab, we:
- Implement sorting algorithms to sort a list of numbers in ascending and descending orders.
- Calculate the step count (number of comparisons, swaps, or assignments) for each algorithm to analyze its performance.
- Compare performance across different input sizes and scenarios.
- Visualize the results by plotting graphs.

---

Prerequisites

To run the code, you need the following:
- Java Development Kit (JDK) installed on your system.
  - You can download the JDK from [here](https://www.oracle.com/java/technologies/javase-downloads.html).
- A terminal or command-line tool to compile and run the Java files.
  
---

Files in This Repository

| File Name            | Description                                                     |
|----------------------|-----------------------------------------------------------------|
| BubbleSort.java     | Contains the implementation of Bubble Sort and step count logic.|
| SelectionSort.java  | Contains the implementation of Selection Sort and step count logic.|
| InsertionSort.java  | Contains the implementation of Insertion Sort and step count logic.|
| README.md           | This file, explaining how to run the code and the lab purpose.   |

---

How to Run the Code

Step 1: Compile the Java Files

Before running the sorting algorithms, you need to compile the .java files using the javac (Java Compiler) command. Navigate to the directory where the files are located and compile each file like this:


javac BubbleSort.java
javac SelectionSort.java
javac InsertionSort.java


This will generate `.class` files that are ready to be executed.

Step 2: Run the Code

To execute the sorting algorithms and view the sorted array and step count, run the compiled `.class` files using the `java` command:


java BubbleSort
java SelectionSort
java InsertionSort


The output will display:
- The sorted array (both in ascending and descending order).
- The number of steps (comparisons and swaps) taken by the algorithm.

---

Example Input and Output

Bubble Sort Example
Input:

[35, 12, 48, 7, 22]


Output:

Sorted array: 7 12 22 35 48
Step count: 10


Selection Sort Example
Input:

[35, 12, 48, 7, 22]


Output:

Sorted array: 7 12 22 35 48
Step count: 8


Insertion Sort Example
Input:

[35, 12, 48, 7, 22]


Output:

Sorted array: 7 12 22 35 48
Step count: 6


---

Graphing the Results

Once you've collected step counts for different input sizes (e.g., 10, 20, 30, 40), you can use tools like Excel or Python's Matplotlib to plot graphs comparing step counts for the different algorithms.

Suggested graph:
- X-axis: Input size (10, 20, 30, 40)
- Y-axis: Step count
- Plot: Separate lines for Bubble Sort, Selection Sort, and Insertion Sort

---

Best, Worst, and Average Case Scenarios

- Best Case: Sorted input (e.g., `[1, 2, 3, 4, 5]`)
- Worst Case: Reverse sorted input (e.g., `[5, 4, 3, 2, 1]`)
- Average Case: Randomized input (e.g., `[35, 12, 48, 7, 22]`)

These different cases will help you analyze the performance of each sorting algorithm in varying conditions.

---

### Author

- Naman Natarajan: Student of B.Tech CSE (AIML), 4th Semester.
- Course: Analysis and Design of Algorithms (ENCS202)
- Instructor: Dr. Meenu
