package com.Employee.codePractice;

public class FindPerfectNumber {
    public static void main(String[] args) {
        int num = 6;      // Number to check
        int sum = 0;      // Sum of divisors
        for (int i = 1; i <= num / 2; i++) { // Check till num/2
            if (num % i == 0) {               // If i divides num
                sum = sum + i;                // Add divisor
            }
        }
        if (sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
