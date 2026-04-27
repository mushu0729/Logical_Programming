package edu.jspiders.character_Verifier_And_Displayer_System.java_app;

import java.util.Scanner;
public interface JavaApp {
	public static void execution() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character: ");
		char ch = sc.next().charAt(0);
		sc.close();
		Char.charVerifier(ch);
		Char.charDisplayer(ch);
	}
}
