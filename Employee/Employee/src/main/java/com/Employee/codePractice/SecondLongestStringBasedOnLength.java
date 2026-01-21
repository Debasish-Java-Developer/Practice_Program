package com.Employee.codePractice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLongestStringBasedOnLength {
    public static void main(String[] args) {
        List<String> list = List.of("Debas", "Alexandra", "John", "Catherine", "Boba");
        Optional<String> result=list.stream()
                .sorted(Comparator.comparing(String::length))
                .skip(1)
                .findFirst();
        System.out.println(result);
    }
}
