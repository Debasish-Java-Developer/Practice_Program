package com.Employee.codePractice;

import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurancesOfStringAndPrintInString{
    public static void main (String [] args){
        String input = "ACBCCBA";
        //Char result = "A2B2C3"
        Map<Character, Long> frequency= input.chars()
                .mapToObj(C->(char)C)
                .collect(Collectors.groupingBy(ch->ch, Collectors.counting()
                ));

        frequency.entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(e -> e.getKey() + String.valueOf(e.getValue()))
                .forEach(System.out::print);
    }

}