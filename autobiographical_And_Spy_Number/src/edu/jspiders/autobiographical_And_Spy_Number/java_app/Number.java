package edu.jspiders.autobiographical_And_Spy_Number.java_app;

public interface Number {
	public static void autoBiographical(int num) {
		if(num>0) {
			int count =0;
			for(int t=num;t>0;t=t/10) {
				count ++;
			}
			int digits=0;
			int sum = 0;
			for(int t=num;t>0;t=t/10) {
				digits = t % 10;
				sum = sum+digits;
			}
			if(count==sum) {
				System.out.println("Autobiographical Number");
			}
			else {
				System.out.println("Not Autobiographical Number");
			}
		}
		else {
			System.out.println("Invalid");
		}
	}
	public static void spy(int num) {
		if(num>0) {
			int digits=0;
			int sum = 0;
			for(int t=num;t>0;t=t/10) {
				digits = t % 10;
				sum = sum+digits;
			}

			int product = 1;
			for(int t=num;t>0;t=t/10) {
				digits = t % 10;
				product = product*digits;
			}
			if(sum==product) {
				System.out.println("Spy Number");
			}
			else {
				System.out.println("Not Spy Number");
			}
		}
		else {
			System.out.println("Invalid");
		}
	}
}
