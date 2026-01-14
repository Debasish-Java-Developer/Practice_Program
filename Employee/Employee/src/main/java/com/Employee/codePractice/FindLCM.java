package com.Employee.codePractice;

public class FindLCM {
    public static void main(String[] args) {
        int a = 12;   // First number
        int b = 18;   // Second number
        int x = a;    // Store original a
        int y = b;    // Store original b
        // Find GCD using Euclidean Algorithm
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;                 // GCD value
        int lcm = (a * b) / gcd;     // LCM formula
        System.out.println("LCM = " + lcm);
    }
}
