package com.Employee.codePractice;

public class FindGCD {
    public static void main(String[] args) {
        int a = 24;   // First number
        int b = 36;   // Second number
        while (b != 0) {   // Repeat until remainder becomes 0
            int temp = b;  // Store b
            b = a % b;     // Find remainder
            a = temp;      // Assign previous b to a
        }
        System.out.println("GCD = " + a); // a contains GCD
    }
}
