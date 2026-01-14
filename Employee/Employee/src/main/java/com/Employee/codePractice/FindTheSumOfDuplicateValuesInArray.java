package com.Employee.codePractice;

import java.util.*;

public class FindTheSumOfDuplicateValuesInArray {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 2, 4, 5, 3, 6, 3};

        // Convert array to list
        List<Integer> list = Arrays.asList(arr);

        // Find duplicates (distinct) and sum them
        int sum =
                list.stream()
                        .filter(n -> Collections.frequency(list, n) > 1)   // keep duplicates
                        .distinct()                                        // unique duplicates
                        .mapToInt(Integer::intValue)                       // convert to int
                        .sum();                                            // sum duplicate values

        System.out.println("Duplicate values sum: " + sum);
    }
}

