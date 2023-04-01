package com.ericpark.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SandboxApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(SandboxApplication.class, args);
//	}

	public static void main(String[] args) {
		System.out.println("--------------------------------");
		String string = "Take this string and reverse it";
		              //"it reverse and string this take"
		String[] words = string.split(" "); // [ "Take", "this", ... ]

		System.out.println("original:\t\t   " + string);

		System.out.print("reverse each word: ");
		for(String word : words) { //Take elements from words and store them in word
			reverse(word);
			System.out.print(" ");
		}

		System.out.print("\nTotal reverse:\t   ");
		reverse(string);

		System.out.println("\n--------------------------------");
	}

	/**
	 * From this we have the logic to reverse any string
	 */
	public static void reverse(String temp) {
		for(int var = temp.length(); var > 0; var--) {
			System.out.print(temp.charAt(var-1));
		}
	}
}
