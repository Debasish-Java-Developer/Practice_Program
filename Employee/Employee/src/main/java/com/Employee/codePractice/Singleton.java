package com.Employee.codePractice;

public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {
        System.out.println("Singleton object created");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton");
    }
}

class TestSingleton {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.showMessage();
        System.out.println(s1 == s2); // true
    }
}
