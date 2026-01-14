package com.Employee.codePractice;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2}; // Input array
        Map<Integer, Integer> freqMap = new HashMap<>(); // Store frequency
        for (int i = 0; i < arr.length; i++) {           // Loop through array
            if (freqMap.containsKey(arr[i])) {           // If element exists
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1); // Increase count
            } else {
                freqMap.put(arr[i], 1);                  // First occurrence
            }
        }
        // Print frequency
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
