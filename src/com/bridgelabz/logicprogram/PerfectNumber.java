package com.bridgelabz.logicprogram;

import java.util.Scanner;

public class PerfectNumber {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static void getPerfectNumber(int num) {
		int sum = 0, i = 1;

		while (i <= num / 2) // execute until the condition becomes false.
		{
			if (num % i == 0) {
				sum = sum + i; // calculates the sum of factors.

			}
			i++; // after each iteration increments the value of variable i by 1.
		}
		if (sum == num) // compares sum with the number.
		{
			System.out.println(num + "is a perfect number. "); // print if sum and num are equal.
		} else {
			System.out.println(num + " is not a perfect number.");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number to check given number is perfect or not : ");
		int num = PerfectNumber.getIntValue();
		PerfectNumber.getPerfectNumber(num);
	}

}
