package com.bridgelabz.logicprogram;

import java.util.Scanner;

public class ReverseNumber {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static void getReverseNumber(int num) {
		int reverse = 0;
		while (num != 0) { // repeat below steps until the num becomes 0.
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("The reverse of the given number is :" + reverse);
	}

	public static void main(String[] args) {
		System.out.println("Enter the number to find reverse number : ");

		int num = ReverseNumber.getIntValue();
		ReverseNumber.getReverseNumber(num);
	}

}
