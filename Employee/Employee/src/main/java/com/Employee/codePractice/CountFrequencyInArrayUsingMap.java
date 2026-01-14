package com.Employee.codePractice;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyInArrayUsingMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2}; // Input array
        Map<Integer, Integer> map = new HashMap<>(); // Store frequency
        for (int i = 0; i < arr.length; i++) {       // Loop through array
            if (map.containsKey(arr[i])) {           // If key exists
                map.put(arr[i], map.get(arr[i]) + 1); // Increase count
            } else {
                map.put(arr[i], 1);                  // First occurrence
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
