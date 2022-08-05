package com.bridgelabz.logicprogram;

import java.util.Scanner;

public class PrimeNmuber {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static void getPrimeNumber(int num) {

		int i, m = 0, flage = 0;
		m = num / 2; // it is condition to check nonPrime Number
		if (num == 0 || num == 1) {
			System.out.println(num + "is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not prime number ");
					flage = 1;
					break;

				}
			}
			if (flage == 0) {
				System.out.println(num + " is prime number ");
			}
		}
	}
	public static void main(String[] args) {

		System.out.println("Enter a number to check given number is prime number or not : ");

		int num = PrimeNmuber.getIntValue();
		PrimeNmuber.getPrimeNumber(num);
	}

}
