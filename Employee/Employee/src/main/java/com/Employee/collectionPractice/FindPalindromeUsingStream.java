package com.Employee.collectionPractice;

import java.util.stream.IntStream;

public class FindPalindromeUsingStream {
    public static void main(String[] args) {
        int num = 212;                 // Number to check
        String str = String.valueOf(num); // Convert number to String
        boolean isPalindrome =
                IntStream.range(0, str.length() / 2)     // Loop till half length
                        .allMatch(i ->
                                str.charAt(i) == str.charAt(str.length() - i - 1)
                        );                               // Compare characters
        if (isPalindrome) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
