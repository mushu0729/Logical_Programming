package edu.jspiders.digit_Display_Count_Sum_Product.java_app;

import java.util.Scanner;
public interface JavaApp {
	public static void execution() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Integer Type Number: ");
		int num = sc.nextInt();
		sc.close();
		Number.digitDisplayer(num);
		Number.digitCountDisplayer(num);
		Number.digitSumDisplayer(num);
		Number.digitProductDisplayer(num);
	}
}
