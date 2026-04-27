package edu.jspiders.evenAndOdd_Digits_Sum_Product.java_app;

public interface EvenOdd {
	public static void evenDigitDisplay(int num) {
		if(num>0) {
			int digits = 0;
			for(int t=num;t>0;t=t/10) {
				digits = t%10;
				if(digits %2 == 0 ) {
					System.out.println("Even Digit: "+digits);
				}
			}
		}
	}
	
	public static void oddDigitDisplay(int num) {
		if(num>0) {
			int digits = 0;
			for(int t=num;t>0;t=t/10) {
				digits = t%10;
				if(digits %2 != 0 ) {
					System.out.println("Odd Digit: "+digits);
				}
			}
		}
	}
	
	public static void evenDigitCountDisplay(int num) {
		if(num>0) {
			int digits = 0;
			int count = 0;
			for(int t=num;t>0;t=t/10) {
				digits = t%10;
				if(digits %2 ==0) {
					count ++;
				}
			}
			System.out.println("Even Digit Count: " + count);
		}
	}
	
	public static void oddDigitCountDisplay(int num) {
		if(num>0) {
			int digits = 0;
			int count = 0;
			for(int t=num;t>0;t=t/10) {
				digits = t%10;
				if(digits %2 !=0) {
					count ++;
				}
			}
			System.out.println("Odd Digit Count: " + count);
		}
	}
	
	public static void evenDigitSumDisplay(int num) {
		if(num>0) {
			int digits = 0;
			int sum = 0;
			for(int t=num;t>0;t=t/10) {
				digits = t%10;
				if(digits %2 ==0) {
					sum = sum+digits;
				}
			}
			System.out.println("Even Digit Sum: " + sum);
		}
	}
	
	public static void oddDigitSumDisplay(int num) {
		if(num>0) {
			int digits = 0;
			int sum = 0;
			for(int t=num;t>0;t=t/10) {
				digits = t%10;
				if(digits %2 !=0) {
					sum = sum+digits;
				}
			}
			System.out.println("Odd Digit Sum: " + sum);
		}
	}
	
	public static void evenDigitProductDisplay(int num) {
		if(num>0) {
			int digits = 0;
			int product = 1;
			for(int t=num;t>0;t=t/10) {
				digits = t%10;
				if(digits %2 ==0) {
					product = product*digits;
				}
			}
			System.out.println("Even Digit Product: " + product);
		}
	}
	
	public static void oddDigitProductDisplay(int num) {
		if(num>0) {
			int digits = 0;
			int product = 1;
			for(int t=num;t>0;t=t/10) {
				digits = t%10;
				if(digits %2 !=0) {
					product = product*digits;
				}
			}
			System.out.println("Odd Digit Product: " + product);
		}
	}
}
