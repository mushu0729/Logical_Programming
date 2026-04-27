package edu.jspiders.number_Displayer_System.java_app;

public interface JavaApp {
	java.util.Scanner SCANNER = new java.util.Scanner(System.in);
	public static void execution() {
		System.out.println("Enter the Starting Number of Series");
		int start = SCANNER.nextInt();
		System.out.println("Enter the Ending Number of Series");
		int end = SCANNER.nextInt();
		Series.verifierSystem(start,end);
		SCANNER.close();
	}
}
