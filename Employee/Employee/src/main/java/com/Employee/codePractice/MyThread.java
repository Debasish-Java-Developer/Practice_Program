package com.Employee.codePractice;

public class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread a = new MyThread();
        a.start();
    }
}
