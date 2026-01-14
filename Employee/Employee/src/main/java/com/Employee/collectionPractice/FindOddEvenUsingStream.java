package com.Employee.collectionPractice;

import java.util.stream.IntStream;

public class FindOddEvenUsingStream {
    public static void main(String[] args) {
        int num = 10; // Number to check
        boolean isEven = IntStream.of(num)   // Create stream with the number
                .anyMatch(n -> n % 2 == 0); // Check even
        if (isEven) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
