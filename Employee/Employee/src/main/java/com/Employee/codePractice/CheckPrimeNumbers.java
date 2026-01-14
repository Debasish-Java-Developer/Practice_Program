package com.Employee.codePractice;

import java.util.stream.IntStream;

public class CheckPrimeNumbers {
    public static void main(String[] args) {
        int n = 20; // Upper limit
        IntStream.rangeClosed(2, n)                          // Numbers from 2 to n
                .filter(num ->                          // Filter prime numbers
                        IntStream.range(2, num)             // Check divisors
                                .noneMatch(i -> num % i == 0))
                .forEach(num -> System.out.print(num + " ")); // Print primes
    }
}

