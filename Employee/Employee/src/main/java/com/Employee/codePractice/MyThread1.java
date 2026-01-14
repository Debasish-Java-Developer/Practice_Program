package com.Employee.codePractice;

public class MyThread1 implements Runnable{
    public void run(){
        System.out.println("Runnable Thread is running...");
    }

    public static void main(String[] args) {
        MyThread1 myRunnable = new MyThread1();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
