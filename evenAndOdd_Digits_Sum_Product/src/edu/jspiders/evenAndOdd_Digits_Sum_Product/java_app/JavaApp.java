package edu.jspiders.evenAndOdd_Digits_Sum_Product.java_app;

import java.util.Scanner;
public interface JavaApp {
	public static void execution() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Positive Integer Number");
		int num = sc.nextInt();
		sc.close();
		EvenOdd.evenDigitDisplay(num);
		EvenOdd.evenDigitCountDisplay(num);
		EvenOdd.evenDigitSumDisplay(num);
		EvenOdd.evenDigitProductDisplay(num);
		System.out.println();
		EvenOdd.oddDigitDisplay(num);
		EvenOdd.oddDigitCountDisplay(num);
		EvenOdd.oddDigitSumDisplay(num);
		EvenOdd.oddDigitProductDisplay(num);
	}
}
