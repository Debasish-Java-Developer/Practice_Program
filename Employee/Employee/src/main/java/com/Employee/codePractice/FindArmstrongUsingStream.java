package com.Employee.codePractice;

public class FindArmstrongUsingStream {
    public static void main(String[] args) {
        int num = 153;                                        // Number to check
        String str = String.valueOf(num);                    // Convert number to String
        int digits = str.length();                          // Count digits
        int sum = str.chars()                              // Create stream of characters
                .map(c -> c - '0')                    // Convert char to digit
                .map(d -> (int) Math.pow(d, digits)) // digit^digits
                .sum();                                 // Sum all values
        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}

