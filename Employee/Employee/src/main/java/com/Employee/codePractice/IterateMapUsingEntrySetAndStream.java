package com.Employee.codePractice;

import java.util.HashMap;
import java.util.Map;

public class IterateMapUsingEntrySetAndStream {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "Hibernate");
        // Iterate map using Java 8 stream
        map.entrySet()
                .stream()
                .forEach(entry ->
                        System.out.println(entry.getKey() + " -> " + entry.getValue())
                );
    }
}
