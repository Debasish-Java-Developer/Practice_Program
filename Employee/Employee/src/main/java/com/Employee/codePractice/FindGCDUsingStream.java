package com.Employee.codePractice;

import java.util.stream.IntStream;

public class FindGCDUsingStream {
    public static void main(String[] args) {
        int a = 24;   // First number
        int b = 36;   // Second number
        int gcd = IntStream.rangeClosed(1, Math.min(a, b)) // Common range
                .filter(i -> a % i == 0 && b % i == 0) // Common divisors
                .max()                                  // Find greatest
                .orElse(1);                             // Default
        System.out.println("GCD = " + gcd);
    }
}

