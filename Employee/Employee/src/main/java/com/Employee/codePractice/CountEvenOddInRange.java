package com.Employee.codePractice;

public class Main {
    public static void main(String[] args) {

        int start = 1;   // Range start
        int end = 10;    // Range end

        int evenCount = 0; // Count of even numbers
        int oddCount = 0;  // Count of odd numbers

        for (int i = start; i <= end; i++) { // Loop through range
            if (i % 2 == 0) {                 // Check even
                evenCount++;                  // Increase even count
            } else {
                oddCount++;                   // Increase odd count
            }
        }

        System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);
    }
}
