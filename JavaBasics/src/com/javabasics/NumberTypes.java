package com.javabasics;

import java.awt.*;
import java.util.Date;

public class NumberTypes {
    public static void main(String[] args) {

        int myAge = 30;
        // We have to initialize the variable with a type and set it to a location in memory
        myAge = 35;
        // variables can be reassigned
        System.out.println(myAge);


        int herAge = myAge;
        // We can assign one variable to another
        System.out.println(herAge);

//  Primitive vs Reference types
        // Primitive types are used to store simple values
        // Reference types are used for storing complex values

        // Primitive types
        // byte = 1 byte (8-bit [-128,127])
        // short = 2 bytes (16-bit [-32k,32k])
        // int = 4 bytes (32-bit [-2B,2B])
        // long = 8 bytes (64-bit [-2^64/2 , 2^64/2 - 1]
        // float = 4 bytes
        // double = 8 bytes
        // char = 2 bytes (for storing single letters)
        // boolean = 1 byte (true/false)

        short income = 32_000;
        int viewCount = 123_456_789;
        long moreViewCount = 3_123_456_789L;
        float price = 10.99F;
        double pi = 3.141529;
        char letter = 'A';
        boolean isEligible = false;
        // floats and longs we have to specify that those are the value types we're dealing with, that way we won't lost any data
        // it's almost like having to specify that this is the end of this number
        // single characters we surround with single quotes, multiple character strings with double quotes
        // boolean defaults to false

        // Reference types
        // When dealing with reference types, we always have to allocate memory
        // Date is like the Date class in ruby where it has all of it's own methods/members.
        // we have to instantiate it to be able to use it though
        Date now = new Date();

        // When you create a primitive variable, when it is declared, it's declared at a memory location
        // Whereas a reference type will reference the address of the memory location where it was declared, so when you change one variable, it ends up changing all of them

        byte number = 5;
        byte primitiveReferencedNumber = number;
        number = 6;
        // This doesn't change the primitiveReferencedNumber, it's still 5 because it was declared when number was = 5
        byte primitiveReferencedNumber2 = number;
        System.out.println(number); // 6
        System.out.println(primitiveReferencedNumber); // 5
        System.out.println(primitiveReferencedNumber2); // 6

        // primitive types are copied by their value, and reference types are copied through their reference
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 3;
        System.out.println(point1); // [x=3,y=1]
        System.out.println(point2); // [x=3,y=1]

        // byte > short > int > long > float > double
    }
}
