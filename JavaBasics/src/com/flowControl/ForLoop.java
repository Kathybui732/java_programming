package com.flowControl;

public class ForLoop {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 5, -5};

        for (int number: numbers) {
            System.out.println(number * 2);
        }
    }
}

// we can also make infinite loops if we give it a condition that will never yield true