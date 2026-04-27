package edu.jspiders.digit_Display_Count_Sum_Product.java_app;

public interface Number {
	public static void digitDisplayer(int num) {
		int digits =0;
		for(int t=num;t>0;t=t/10) {
			digits = t % 10;
			System.out.println("Digits: "+digits);
		}
	}
	public static void digitCountDisplayer(int num) {
		int count =0;
		for(int t=num;t>0;t=t/10) {
			count ++;
		}
		System.out.println("Count: "+count);
	}
	public static void digitSumDisplayer(int num) {
		int digits =0;
		int sum = 0;
		for(int t=num;t>0;t=t/10) {
			digits = t % 10;
			sum = sum+digits;
		}
		System.out.println("Sum: "+sum);
	}
	public static void digitProductDisplayer(int num) {
		int digits =0;
		int product = 1;
		for(int t=num;t>0;t=t/10) {
			digits = t % 10;
			product = product * digits;
		}
		System.out.println("Product: "+product);
	}
}
