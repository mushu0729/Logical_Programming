package edu.jspiders.character_Verifier_And_Displayer_System.java_app;

import java.util.Scanner;
public interface JavaApp {
	public static void execution() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character: ");
		char ch = sc.next().charAt(0);
		Char.charVerifier(ch);
		System.out.println("Enter the Start Point Character");
		char s = sc.next().charAt(0);
		System.out.println("Enter the End Point Character");
		char e = sc.next().charAt(0);
		sc.close();
		Char.charDisplayer(s,e);
	}
}
