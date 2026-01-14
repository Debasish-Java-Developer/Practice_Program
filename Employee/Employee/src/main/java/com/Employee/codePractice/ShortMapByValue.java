package com.Employee.codePractice;

import java.util.*;
import java.util.stream.Collectors;

public class ShortMapByValue {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Banana");
        map.put(1, "Apple");
        map.put(2, "Orange");
        // Sort HashMap by value using stream
        Map<Integer, String> sortedMap =
                map.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldVal, newVal) -> oldVal,
                                LinkedHashMap::new
                        ));
        // Print sorted map
        sortedMap.forEach((k, v) ->
                System.out.println(k + " -> " + v));
    }
}
