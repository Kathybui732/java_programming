package com.mortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;

        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * MONTHS_IN_YEAR;

        double value = Math.pow(( 1 + monthlyInterestRate ), numberOfPayments);
        double mortgage = (principal * monthlyInterestRate * value)/(value-1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currency.format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted);
    }
}