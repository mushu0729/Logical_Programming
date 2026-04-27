package edu.jspiders.number_Verifier_System.java_app;

public interface number {
	public static void verifySystem(int n) {
		if(n<0) {
			if(n%2==0) {
				System.out.println("Negetive and Even");
			}
			else if(n%2 !=0) {
				System.out.println("Negetive and Odd");
			}
		}
		else if(n>0) {
			if(n%2==0) {
				System.out.println("Positive and Even");
			}
			else if(n%2 !=0) {
				System.out.println("Positive and Odd");
			}
		}
		else {
			System.out.println("Neutral");
		}
	}
}
