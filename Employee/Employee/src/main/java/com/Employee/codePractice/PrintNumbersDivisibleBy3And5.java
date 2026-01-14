package com.Employee.codePractice;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {      // Loop from 1 to 100
            if (i % 3 == 0 && i % 5 == 0) {   // Divisible by both 3 and 5
                System.out.print(i + " ");   // Print number
            }
        }
    }
}

