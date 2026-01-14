package com.Employee.collectionPractice;

import java.util.stream.IntStream;

public class ReverseNumberUsingStream {
    public static void main(String[] args) {
        int num = 1234;                       // Number to reverse
        String str = String.valueOf(num);     // Convert number to String
        String reversed =
                IntStream.range(0, str.length())     // Index range
                        .mapToObj(i -> str.charAt(str.length() - 1 - i)) // Reverse order
                        .collect(StringBuilder::new,
                                StringBuilder::append,
                                StringBuilder::append)
                        .toString();                 // Convert to String
        System.out.println("Reversed Number = " + reversed); // Print result
    }
}

