package com.Employee.codePractice;

import java.util.List;
import java.util.stream.Collectors;

import static org.hibernate.internal.util.collections.ArrayHelper.forEach;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheUniqueCharacter {
    public static void main(String[] args) {

        // Input string
        String str = "ABCDABC";

        // Convert string to List<String> where each element is one character
        List<String> list = str.chars()                          // stream of int chars
                .mapToObj(c -> String.valueOf((char) c)) // convert to String char
                .collect(Collectors.toList());    // collect to list

        // Use stream to remove duplicates and join back to string
        String result = list.stream()               // create stream
                .distinct()             // remove duplicates
                .collect(Collectors.joining()); // join characters

        // Print output
        System.out.println(result);                 // Output: ABCD
    }
}
