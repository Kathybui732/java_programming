package com.javabasics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // in the Scanner(), we can tell the scanner where we want to get the information from
            // i.e. terminal or another file
        System.out.print("Number: ");
        byte number = scanner.nextByte();
        System.out.println(number);

        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

        System.out.print("Name: ");
        String name = scanner.next();
        System.out.println("Your name is ".concat(name));

        System.out.print("Full Name: ");
        String full = scanner.nextLine().trim();
        System.out.println("Your full name is " + full);

        // The next method only reads one token, that is it only reads the first word in a string sentence
        // So if you wrote your whole name John Smith, it would only return John
    }
}