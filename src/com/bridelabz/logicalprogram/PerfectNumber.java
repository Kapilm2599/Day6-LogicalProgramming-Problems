package com.bridelabz.logicalprogram;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // user input
		System.out.println("Enter Number: ");
		int number = scanner.nextInt(); // read the number from the user
		int result = 0;

		for (int i = 1; i <= number / 2; i++) { // Executes until the condition
			if (number % i == 0) {
				result = result + i; // calculates the sum of factors

			}

		}
		if (result == number) // Compares result with the number
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect NUmber");

	}


}
