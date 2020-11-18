package com.javabasics;
// Java statements should be terminated with a ;
// The .class version of this file is the byte code - it is platform independent - this makes java applications portable

import java.awt.*;
import java.util.Date;

public class HelloWorld {

    public static void main(String[] args) {
            // public meaning it is accessible from other parts of this program (it is global)
            // Main method should always be static - static is a keyword that allows this class to be invoked without having to instantiate the class first
            // The return type is void, which means that there is no return value for this method
            // String[] args is the parameter for this method
        System.out.println("Hello World!");
    }
}