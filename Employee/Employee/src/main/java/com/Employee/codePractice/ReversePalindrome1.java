package com.Employee.codePractice;

import java.util.stream.*;

public class ReversePalindrome1 {
    public static void main(String[] args) {

        // Input string
        String input = "Debasish";

        // Simplest stream-based reverse
        String reversed = new StringBuilder(input)       // Build mutable string
                .reverse()                               // Reverse characters
                .chars()                                 // Convert to IntStream
                .mapToObj(c -> String.valueOf((char) c)) // Convert each to String
                .collect(Collectors.joining());          // Join all

        // Print result
        System.out.println("Reversed: " + reversed);
    }
}

