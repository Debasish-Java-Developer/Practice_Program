package com.Employee.codePractice;

import java.util.HashMap;
import java.util.Map;

public class IterateMapUsingEntrySet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "Hibernate");
        // Iterate map using entrySet
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
