package com.Employee.codePractice;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;        // Number to reverse
        int reverse = 0;       // Variable to store reversed number
        while (num > 0) {      // Loop until number becomes 0
            int digit = num % 10;        // Get last digit
            reverse = reverse * 10 + digit; // Add digit to reverse
            num = num / 10;              // Remove last digit
        }
        System.out.println("Reversed Number = " + reverse); // Print result
    }
}
