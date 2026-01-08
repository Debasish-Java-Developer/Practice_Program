package com.Employee.collectionPractice;

import java.util.List;
import java.util.stream.Collectors;

import java.util.*;
import java.util.stream.*;

public class UniqueWordsUsingStream {

    public static void main(String[] args) {
        String input = "java is easy and java is powerful";
        String[] words = input.split(" ");

        Arrays.stream(words)                    // convert array to stream
                .distinct()                     // remove duplicate words
                .sorted()                       // sort words alphabetically
                .forEach(System.out::println);  // print each word
    }
}

