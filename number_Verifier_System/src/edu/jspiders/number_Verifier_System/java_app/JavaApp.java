package edu.jspiders.number_Verifier_System.java_app;

import java.util.Scanner;
public interface JavaApp {
	public static void execution() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Integer Type Number: ");
		int n = sc.nextInt();
		number.verifySystem(n);
		sc.close();
	}
}
