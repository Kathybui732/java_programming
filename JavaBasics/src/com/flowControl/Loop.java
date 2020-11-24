package com.flowControl;

public class Loop {
    public static void main(String[] args) {

        // Normal loop
        // for ( initialExpression; testExpression; updatedExpression) {
        // Do this if test condition is true
        // }

        byte n = 5;
        for (byte i = 0; i < n; ++i) {
            System.out.println(i);
        }

        int sum = 0;

        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        System.out.println(sum);
    }
}
