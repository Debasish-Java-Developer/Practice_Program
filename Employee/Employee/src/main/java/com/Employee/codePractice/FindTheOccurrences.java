package com.Employee.codePractice;

public class FindTheOccurrences {
    //Write the code to get the occurances of a list of integers.

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6, 3};

        // Create an array to hold the count of each integer (assuming integers are in range 0-9)
        int[] count = new int[10];

        // Count occurrences
        for (int num : arr) {
            count[num]++;
        }

        // Print occurrences
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(i + " occurs " + count[i] + " times");
            }
        }
    }
}
