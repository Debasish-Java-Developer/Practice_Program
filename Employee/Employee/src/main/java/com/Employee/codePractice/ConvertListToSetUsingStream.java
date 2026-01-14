package com.Employee.codePractice;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertListToSetUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3);
        Set<Integer> set =
                list.stream()                 // Convert list to stream
                        .collect(Collectors.toSet()); // Collect into set
        System.out.println(set);
    }
}
