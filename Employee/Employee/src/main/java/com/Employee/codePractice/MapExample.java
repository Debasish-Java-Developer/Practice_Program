package com.Employee.codePractice;

import java.util.Arrays;
import java.util.List;

import java.util.stream.*;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "spring");
        // map converts each string to uppercase
        List<String> result = names.stream()
                .map(name -> name.toUpperCase()) // one input → one output
                .collect(Collectors.toList());
        System.out.println(result);
    }
}

