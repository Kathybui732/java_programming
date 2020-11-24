package com.flowControl;

public class ForEachLoop {
    public static void main(String[] args) {
        // for(dataType item: array) {
        // do this
        // }

        int[] numbers = {1,2,3,4};
        int sum = 0;

        for (int number:numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}

// for each loop is preferred over for loops when working with arrays/collections
