package com.Employee.codePractice;

import java.util.*;
import java.util.stream.*;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("Java", "Spring"),
                Arrays.asList("Hibernate", "Microservice")
        );
        // flatMap converts multiple lists into one stream
        List<String> result = list.stream()
                .flatMap(innerList -> innerList.stream()) // many outputs → merged
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
