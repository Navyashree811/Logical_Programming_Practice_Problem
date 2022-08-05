package com.bridgelabz.logicprogram;

public class FibonacciSeries {
	public static void getfibonacciSeries() {

		int n1 = 0, n2 = 1, n3, i, count = 10;

		System.out.println("The first number of fiboacci series are 0 and 1. ");
		System.out.println(n1 + " " + n2); // print 0 and 1

		for (i = 2; i < count; i++) { // loop starts from 2 because 0 and 1 are already printed.
			n3 = n1 + n2;
			System.out.println(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Fibonacci Series Program :");

		FibonacciSeries.getfibonacciSeries();
	}

}
