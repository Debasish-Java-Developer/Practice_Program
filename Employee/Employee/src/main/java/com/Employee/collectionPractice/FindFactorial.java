package com.Employee.collectionPractice;

public class FindFactorial {
    public static void main(String[] args) {
        int num = 5;        // Number to find factorial
        long factorial = 1; // Variable to store factorial
        for (int i = 1; i <= num; i++) { // Loop from 1 to num
            factorial = factorial * i;  // Multiply numbers
        }
        System.out.println("Factorial = " + factorial); // Print result
    }
}

