package com.Employee.codePractice;

import java.util.*;
import java.util.stream.*;

public class ReversePalindrome {
    public static void main(String[] args) {

        // Original palindrome string
        String input = "Debasish";

        // Convert the string to a stream of Characters
        List<Character> charList = input
                .chars()                          // Get IntStream of characters
                .mapToObj(c -> (char) c)          // Convert each int to Character
                .collect(Collectors.toList());    // Collect into a List

        // Reverse the List so we can process characters in reverse order
        Collections.reverse(charList);            // Reverse the list in-place

        // Convert the reversed List back to a String
        String reversed = charList
                .stream()                         // Stream the reversed characters
                .map(String::valueOf)             // Convert each Character to String
                .collect(Collectors.joining());   // Join all to form final string

        // Print result
        System.out.println("Reversed: " + reversed);
    }
}

