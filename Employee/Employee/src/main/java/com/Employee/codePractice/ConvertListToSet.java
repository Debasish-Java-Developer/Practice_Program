package com.Employee.codePractice;

import java.util.*;

import java.util.*;

public class ConvertListToSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        // Convert List to Set
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}
