package com.Employee.codePractice;

import java.util.*;

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

