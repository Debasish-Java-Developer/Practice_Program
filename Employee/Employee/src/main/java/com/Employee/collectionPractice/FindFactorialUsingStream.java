package com.Employee.collectionPractice;

import java.util.stream.IntStream;

public class FindFactorialUsingStream {
    public static void main(String[] args) {
        int num = 5; // Number to find factorial
        long factorial = IntStream.rangeClosed(1, num) // Numbers from 1 to num
                .reduce(1, (a, b) -> a * b); // Multiply all
        System.out.println("Factorial = " + factorial); // Print result
    }
}
