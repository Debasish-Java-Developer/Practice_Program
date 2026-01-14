package com.Employee.codePractice;

public class Main {
    public static void main(String[] args) {
        int n = 10;        // Number of terms
        int first = 0;     // First number
        int second = 1;    // Second number
        System.out.print(first + " " + second + " ");
        for (int i = 3; i <= n; i++) { // Start from 3rd term
            int next = first + second; // Next number
            System.out.print(next + " ");
            first = second;             // Move forward
            second = next;
        }
    }
}
