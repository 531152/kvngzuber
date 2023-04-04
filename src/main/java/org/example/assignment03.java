package org.example;

import java.util.Scanner;

public class assignment03 {
    /**
     * Modify the program below to continually ask for a number. The program should verify that the user actually
     * entered a number. If a valid number was provided, end the program. Otherwise, print an error message.
     * Keep a count of how many attempts it takes for a number to be provided.
     * Print that number if it is greater than 0.
     * <p>
     * Hint: (Scanner) input has many different functions to verify input (e.g. Line 26)
     * </p>
     * The goal of this is to teach the following:
     *  - incrementing integers
     *  - validating input
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                 //initialize a scanner to accept input
        int count = 0;

        while(true) {
            System.out.print("Enter a number: ");               //ask for a number

            count++;                                            //increment count
            if (input.hasNext()) {                              //check if the user entered something
                String value = input.next();                    //store the user input
                System.out.println("You entered: " + value);    //print the user input
                break;                                          //exit the loop
            }
        }

        System.out.println("Loop ran " + count + " times.");    //print the count
    }
}