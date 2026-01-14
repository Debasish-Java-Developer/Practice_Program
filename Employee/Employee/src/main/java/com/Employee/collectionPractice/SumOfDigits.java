package com.Employee.collectionPractice;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1234;     // Number whose digits will be summed
        int sum = 0;        // Variable to store sum of digits
        while (num > 0) {   // Loop until number becomes 0
            int digit = num % 10; // Get last digit
            sum = sum + digit;    // Add digit to sum
            num = num / 10;       // Remove last digit
        }
        System.out.println("Sum of digits = " + sum); // Print result
    }
}
