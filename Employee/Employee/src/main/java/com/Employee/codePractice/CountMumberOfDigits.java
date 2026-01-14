package com.Employee.codePractice;

public class CountMumberOfDigits {
    public static void main(String[] args) {
        int number = 12345; // Number to count digits
        int count = 0;      // Variable to store digit count
        // Loop to count digits
        while (number != 0) {
            number = number / 10; // Remove last digit
            count++;              // Increment count
        }
        System.out.println("Number of digits = " + count); // Print result
    }
}
