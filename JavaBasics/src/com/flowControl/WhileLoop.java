package com.flowControl;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        // while loops will run a code until a certain condition is no longer met
        // while (testExpression) { do this };

        int i = 1;
        int n = 5;

        while(i < n ) {
            System.out.println(i);
            i++;
        }

// -----------------------------------------------------

        // The difference between a while loop and a do while loop is that a do while does something once before incrementing
        do {
            System.out.println(i);
            i++;
        } while(i < n);

// -----------------------------------------------------

        int sum = 0;
        Scanner input = new Scanner(System.in);
        int number = 0;

        while(number >= 0) {
            sum += number;

            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        System.out.println("Sum = " + sum);
        input.close();
    }
}

// infinite while loops happen when the condition is always true, so it will run an infinite number of times and will only stop when memory is full
// for loops are used when the number of iterations is known
// while loops are used when we don't know how many iterations there will be

// The break statement in Java terminates the loop immediately, and the control of the program moves to the next statement following the loop
// If loops are nested, break; will terminate the innermost
// A "labeled" break will terminate the statement with the labeled statement

// The continue statement skips the current iteration of a loop (for, while, do...while, etc).
// The use of labeled continue is often discouraged as it makes your code hard to understand.
// If you are in a situation where you have to use labeled continue, refactor your code and try to solve it in a different way to make it more readable.