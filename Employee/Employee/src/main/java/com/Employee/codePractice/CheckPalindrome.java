package com.Employee.codePractice;

public class Main {
    public static void main(String[] args) {
        String str = "madam";      // Input string
        String reverse = "";       // Store reversed string
        for (int i = str.length() - 1; i >= 0; i--) { // Loop from end to start
            reverse = reverse + str.charAt(i);        // Build reversed string
        }
        if (str.equals(reverse)) { // Compare original and reversed string
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
}
