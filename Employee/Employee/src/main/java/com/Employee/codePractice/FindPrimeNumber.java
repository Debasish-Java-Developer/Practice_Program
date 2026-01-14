package com.Employee.codePractice;

public class FindPrimeNumber {
    public static void main(String[] args) {
        int input = 5;
        if (input <= 1) {
            System.out.println(input + " is not prime");
            return;
        }

        boolean isPrime = true;
        int limit = (int) Math.sqrt(input);
        for (int i = 2; i <= limit; i++) {
            if (input % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(input + (isPrime ? " is prime" : " is not prime"));
    }
}