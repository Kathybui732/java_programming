package com.flowControl;

public class FlowControl {
    public static void main(String[] args) {
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink some water");
        } else if (temp > 20 && temp <=30) {
            System.out.println("Beautiful day");
        } else {
            System.out.println("Cold day");
        }

        // clean one line boolean statement
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);

        // ternary statement
        String className = income >=100_000 ? "First" : "True";
        System.out.println(className);
    }
}
