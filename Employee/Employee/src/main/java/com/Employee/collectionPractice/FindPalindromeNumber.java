package com.Employee.collectionPractice;

public class FindPalindromeNumber {
    public static void main(String[] args) {
        int num = 101;                              // Number to check
        int original = num;                         // Store original number
        int reverse = 0;                            // Variable to store reversed number
        while (num > 0) {                           // Loop until number becomes 0
            int digit = num % 10;                   // Get last digit
            reverse = reverse * 10 + digit;         // Build reverse number
            num = num / 10;                         // Remove last digit
        }
        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}

