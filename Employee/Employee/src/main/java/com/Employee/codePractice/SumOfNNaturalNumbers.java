package com.Employee.codePractice;

public class Main {
    public static void main(String[] args) {
        int n = 10;    // First N natural numbers
        int sum = 0;   // Store sum
        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            sum = sum + i;             // Add number
        }
        System.out.println("Sum = " + sum);
    }
}
