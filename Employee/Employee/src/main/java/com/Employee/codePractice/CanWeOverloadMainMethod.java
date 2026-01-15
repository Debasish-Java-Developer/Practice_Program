package com.Employee.codePractice;

public class CanWeOverloadMainMethod {
    public static void main(String[] args) {
        System.out.println("Main method called by JVM");
        main(10);           // calling overloaded method
        main("Java");
    }

    // overloaded main method
    public static void main(int a) {
        System.out.println("Overloaded main with int: " + a);
    }

    // overloaded main method
    public static void main(String str) {
        System.out.println("Overloaded main with String: " + str);
    }
}
