package edu.jspiders.number_Displayer_System.java_app;

public interface Series {
	public static void verifierSystem(int start, int end) {
		if(start<end) {
			System.out.println("Forward Series");
			for(int i=start;i<=end;i++) {
				System.out.print(i+ " ");
			}
			
		}
		else if(start>end) {
			System.out.println("Backward Series");
			for(int i=start;i>=end;i--) {
				System.out.print(i+ " ");
			}
		}
	}
}
