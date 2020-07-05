/*
Section 1: Create an executable Java program
*/

package com.company.section1;

public class PrintArgs {

    public static void main(String[] args) {

        System.out.println("Printing some arguments in this code: ");

        // Loop through arguments passed and print them to standard output
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}