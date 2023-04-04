package org.example;

import java.util.Scanner;

public class assignment04 {
    /**
     * Modify the program below to find the average of all numbers within the array and print it out
     * <p>
     * The goal of this is to teach the following:
     *  - introduce arrays
     *  - introduce for loops
     * </p>
     * Arrays store data sequentially. Any data type can be an array as long as it is followed by '[]'.
     * An array's length cannot be changed, once it is initialized it is final.
     * In this example, we make use of an 'enhanced for-loop'. It is simpler and more readable than a traditional
     * for-loop. It will take the values sequentially and store the next one in the assigned variable each loop.
     */
    public static void main(String[] args) {
        int[] numberArray = {12, 32, 16, 9, 17, 93, 6, 48};                         //initialize an array of numbers
        System.out.println("numberArray has " + numberArray.length + " items.");    //print the length of the array

        for (int i : numberArray) {                                                 //loop numberArray, assigning a value to variable 'i' each iteration
            System.out.println(i);                                                  //print the current index of the array
        }
    }
}