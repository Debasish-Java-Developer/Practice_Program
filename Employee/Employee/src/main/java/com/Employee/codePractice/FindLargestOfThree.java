package com.Employee.codePractice;

public class Fi {
    public static void main(String[] args) {

        int a = 10;   // First number
        int b = 25;   // Second number
        int c = 15;   // Third number

        if (a >= b && a >= c) {        // Check if a is largest
            System.out.println("Largest = " + a);
        } else if (b >= a && b >= c) { // Check if b is largest
            System.out.println("Largest = " + b);
        } else {                       // Otherwise c is largest
            System.out.println("Largest = " + c);
        }
    }
}
