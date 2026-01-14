package com.Employee.codePractice;

import java.util.Arrays;

// This class demonstrates how to find the top 3 largest numbers in an array using Java Streams
public class FindTopThreeLargestNumbers {
    public static void main(String[] args) {
        int [] numbers = {5, 3, 8, 1, 2}; // Sample array of integers
        Arrays.stream(numbers)
                .boxed() // Boxing int to Integer
                .sorted((a, b) -> b - a)// Sorting in descending order
                .limit(3) // Limiting to top 3 elements
              .forEach(System.out::println);
        // Here :: is a method reference that refers to the println method of System.out
    }
}
