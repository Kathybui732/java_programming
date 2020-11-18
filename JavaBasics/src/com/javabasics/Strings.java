package com.javabasics;

public class Strings {
    public static void main (String[] args) {
        String message1 = new String("Hello World");
        String message2 = "Hello World";
        // String types are reference types, so usually you have to declare a new instance of it
        // But, java lets you do this the shorthand way as if you're declaring a primitive type - DON'T GET CONFUSED

        // concat
        System.out.println(message1.concat("!!!"));
            // When you concat a string, the original stays the same
        System.out.println(message1);

        // endsWith
        System.out.println(message1.endsWith("World"));

        // startsWith
        System.out.println(message1.endsWith("hello"));
            // capitalization matters ^ this returns false

        // length
        System.out.println(message1.length());
    }
}
