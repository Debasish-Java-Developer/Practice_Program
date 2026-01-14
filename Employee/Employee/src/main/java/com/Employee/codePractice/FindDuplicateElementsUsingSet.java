package com.Employee.codePractice;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsUsingSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1}; // Input array
        Set<Integer> set = new HashSet<>(); // Stores unique elements
        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {   // Loop through array
            if (!set.add(arr[i])) {               // add() returns false if already present
                System.out.println(arr[i]);       // Duplicate element
            }
        }
    }
}
