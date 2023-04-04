package org.example;

import java.util.Scanner;

public class assignment05 {
    /**
     * Modify the program below to change the printed word from 'house' -> 'mouse'
     * <p>
     * The goal of this is to teach the following:
     *  - expand on for loops
     *  - modifying arrays
     * Sometimes it is necessary to modify an array's contents. For this, a traditional for-loop is handy since
     * it gives you a variable indicating all available addresses. This allows you to use it to reference specific
     * addresses. An enhanced for-loop only provides you the value at the address.
     */
    public static void main(String[] args) {
        String str = "house";                           //declare a string
        char[] charArray = str.toCharArray();           //convert 'str' to a character array and store the value in a variable 'charArray'

        for (int i = 0; i < charArray.length; i++) {    //loop across the length of 'charArray'
            System.out.println(charArray[i]);           //print the current index of 'charArray'
        }

        System.out.println(charArray);                  //print the value of 'charArray'
    }
}