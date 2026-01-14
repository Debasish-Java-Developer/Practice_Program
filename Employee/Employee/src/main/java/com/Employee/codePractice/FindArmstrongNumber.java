package com.Employee.codePractice;

public class FindArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;              // Number to check
        int original = num;         // Store original number
        int digits = 0;             // Count of digits
        int temp = num;             // Temporary variable
        // Count number of digits
        while (temp > 0) {
            digits++;               // Increase digit count
            temp = temp / 10;       // Remove last digit
        }
        int sum = 0;                // Store Armstrong sum
        temp = num;                 // Reset temp value
        // Calculate sum of digits raised to power of digits
        while (temp > 0) {
            int digit = temp % 10;  // Get last digit
            int power = 1;          // To calculate digit^digits

            for (int i = 1; i <= digits; i++) {
                power = power * digit; // Multiply digit
            }
            sum = sum + power;      // Add to sum
            temp = temp / 10;       // Remove last digit
        }
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}

