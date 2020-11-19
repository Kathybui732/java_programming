package com.javabasics;

import java.util.Arrays;

public class ArrayTypes {
    public static void main(String[] args) {
        byte[] numbers = {1,2,3,4,5};
        System.out.println(numbers);
            // This will print out a weird string - this string is the address of location in memory of this array
        System.out.println(Arrays.toString(numbers));

            // Arrays have a fixed length
        byte[] numbers1 = new byte[5];
        numbers1[2] = 2;
        System.out.println(Arrays.toString(numbers1));

        int[][] matrix = { {1,2,3}, {4,5,6} };
        byte a = 2;
        matrix[1][a] = 7;
        System.out.println(Arrays.deepToString(matrix));
    }
}
