package com.Employee.codePractice;

public class CompareEqualsAndDoubleEquals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = "Hel" + "lo";

        System.out.println(s1 == s2); //True
        System.out.println(s1 == s3); //false
        System.out.println(s1 == s4); //true
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //false
    }
}