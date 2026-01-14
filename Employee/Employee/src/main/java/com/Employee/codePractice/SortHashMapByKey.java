package com.Employee.codePractice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKey {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        // TreeMap sorts entries by key automatically
        Map<Integer, String> sortedMap = new TreeMap<>(map);
        // Print sorted map
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

