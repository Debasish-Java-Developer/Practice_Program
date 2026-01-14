package com.Employee.codePractice;

 public class AbstractClassExample {

    abstract static class Vehicle{
        abstract void startEngine();
    }
    static class Car extends Vehicle{
        @Override
        void startEngine() {
            System.out.println("Car engine started");
        }
    }
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.startEngine();
    }


}
