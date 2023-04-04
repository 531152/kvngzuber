package org.example;

import java.util.Scanner;

public class assignment02 {
    /**
     * Modify the program to continually asks for a number to be entered.
     * If a negative number is entered, end the program.
     * <p>
     * The goal of this is to teach the following:
     *  - introduce `while` loops
     *  - how to exit a loop on demand
     *  - how to use `if` blocks
     *  - introduce conditional statements
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //initialize a scanner to accept input

        while(true) {
            System.out.print("Enter a number: ");   //ask for a number
            int number = input.nextInt();           //store the number

            boolean exit = 1 + 1 == 2;              //create a conditional statement
            if (exit) {
                break;                              //end the loop
            }
        }
    }
}