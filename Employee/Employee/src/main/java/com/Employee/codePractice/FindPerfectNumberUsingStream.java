package com.Employee.codePractice;

import java.util.stream.IntStream;

public class FindPerfectNumberUsingStream {
    public static void main(String[] args) {
        int num = 6; // Number to check
        int sum = IntStream.rangeClosed(1, num / 2) // Divisors range
                .filter(i -> num % i == 0) // Only divisors
                .sum();                    // Sum divisors
        if (sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
