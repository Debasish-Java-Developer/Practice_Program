package com.Employee.codePractice;

import java.util.stream.IntStream;

public class FindLCMUsingStream {
    public static void main(String[] args) {
        int a = 12;   // First number
        int b = 18;   // Second number
        int lcm = IntStream.rangeClosed(1, a * b)    // Range till max possible LCM
                .filter(i -> i % a == 0 && i % b == 0) // Divisible by both
                .findFirst()                          // First such number
                .orElse(0);
        System.out.println("LCM = " + lcm);
    }
}
