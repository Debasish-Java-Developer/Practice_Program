package com.Employee.codePractice;

import java.util.Arrays;

public class FindTheSmallestThreeNumbers {
    public static void main(String[] args) {
        int [] numbers ={1, 5, 3, 8, 0}; // Sample array of integers
        Arrays.stream(numbers)
                .boxed()
                .sorted((a,b)-> a-b) // Sorting in ascending order
                .limit(3)
                .forEach(System.out::println);
    }
}
