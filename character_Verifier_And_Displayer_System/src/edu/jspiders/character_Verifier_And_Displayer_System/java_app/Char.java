package edu.jspiders.character_Verifier_And_Displayer_System.java_app;

public interface Char {
	public static void charVerifier(char ch) {
		if(ch >='0' && ch <='9') {
			System.out.println(ch+" is a Digit");
			if(ch=='2' ||ch=='4' ||ch=='6' ||ch=='8') {
				System.out.println(ch+" is Even Number");
			}
			else if(ch=='1' ||ch=='3' ||ch=='5' ||ch=='7' ||ch=='9') {
				System.out.println(ch+" is Odd Number");
			}
			else {
				System.out.println(ch+" is Neutral Number");
			}
		}
		else if(ch>='A' && ch<='Z') {
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println(ch + " is a Uppercase Vowel Alphabet");
			}
			else {
				System.out.println(ch + " is a Uppercase Consonent Alphabet");
			}
		}
		else if(ch>='a' && ch<='z') {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + " is a Lowercase Vowel Alphabet");
			}
			else {
				System.out.println(ch + " is a Lowercase Consonent Alphabet");
			}
		}
		else {
			System.out.println(ch+" is a Symbol");
		}
	}
	
	public static void charDisplayer(char s, char e) {
		if(s<e) {
			System.out.println("Forward Series");
			System.out.println("--------------");
			for(char ch=s; ch<=e;ch++) {
				System.out.println(ch+" ");
			}
			System.out.println();
		}
		else if(s>e) {
			System.out.println("Backward Series");
			System.out.println("--------------");
			for(char ch=s; ch>=e;ch--) {
				System.out.println(ch+" ");
			}
			System.out.println();
		}
		else {
			System.out.println("Invalid Series!");
		}
	}
	
}
