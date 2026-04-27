package edu.jspiders.beautiful_and_super.java_app;

import java.util.Scanner;
public interface JavaApp {
	public static void execution() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter thePositive Integer Number: ");
		int num = sc.nextInt();
		sc.close();
		beautifulSuper.beautifulNo(num);
		beautifulSuper.superNo(num);
	}
}
