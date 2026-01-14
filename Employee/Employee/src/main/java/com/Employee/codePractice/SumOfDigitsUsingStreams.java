package com.Employee.codePractice;

public class SumOfDigitsUsingStreams {
    public static void main(String[] args) {
        int num = 1234;                        // Number whose digits will be summed
        int sum = String.valueOf(num)          // Convert number to String
                .chars()                  // Create stream of characters
                .map(c -> c - '0')        // Convert char to digit
                .sum();                   // Sum all digits
        System.out.println("Sum of digits = " + sum); // Print result
    }
}

