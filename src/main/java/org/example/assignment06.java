package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assignment06 {
    /**
     * Modify the program below to continually ask for a string. Store each entry into a List. When "stop" is entered
     * print every string that was entered and stop the program.
     * <p>
     * The goal of this is to teach the following:
     *  - introduce List
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  //initialize an empty list
        Scanner input = new Scanner(System.in); //initialize a scanner to accept input

        System.out.println(list);               //print the empty list
        list.add("test");                       //add a test value to the list
        System.out.println(list);               //print the populated list
        list.remove("test");                 //empty the list
        System.out.println(list);               //print the empty list
    }
}