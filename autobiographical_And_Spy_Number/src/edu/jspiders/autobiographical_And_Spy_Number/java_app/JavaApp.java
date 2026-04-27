package edu.jspiders.autobiographical_And_Spy_Number.java_app;

import java.util.Scanner;
public interface JavaApp {
	public static void Execution() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Positive Integer Number: ");
		int num = sc.nextInt();
		sc.close();
		Number.autoBiographical(num);
		Number.spy(num);
	}
}
