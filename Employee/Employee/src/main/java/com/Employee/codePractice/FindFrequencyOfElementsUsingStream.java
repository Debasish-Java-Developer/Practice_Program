package com.Employee.codePractice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyOfElementsUsingStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2}; // Input array
        Map<Integer, Long> freqMap =
                Arrays.stream(arr)                 // Convert array to stream
                        .boxed()                     // int → Integer
                        .collect(Collectors.groupingBy(
                                num -> num,          // Key
                                Collectors.counting() // Count occurrences
                        ));
        // Print frequency
        freqMap.forEach((key, value) ->
                System.out.println(key + " -> " + value));
    }
}
