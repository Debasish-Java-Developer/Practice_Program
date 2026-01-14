package com.Employee.codePractice;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class FindDuplicateElementsUsingSetAndStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1}; // Input array
        Set<Integer> set = new HashSet<>(); // Stores unique elements
        System.out.println("Duplicate elements:");
        Arrays.stream(arr)                 // Convert array to stream
                .filter(num -> !set.add(num)) // add() false means duplicate
                .forEach(System.out::println); // Print duplicates
    }
}
