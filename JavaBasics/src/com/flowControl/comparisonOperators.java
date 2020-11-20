package com.flowControl;

public class comparisonOperators {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);
    }
}
