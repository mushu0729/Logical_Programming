package edu.jspiders.beautiful_and_super.java_app;

public interface beautifulSuper {

    public static int getEvenCount(int num) {
        int count = 0;
        for (int t = num; t > 0; t = t / 10) {
            int digit = t % 10;
            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int getOddCount(int num) {
        int count = 0;
        for (int t = num; t > 0; t = t / 10) {
            int digit = t % 10;
            if (digit % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    
    public static int getEvenSum(int num) {
        int sum = 0;
        for (int t = num; t > 0; t = t / 10) {
            int digit = t % 10;
            if (digit % 2 == 0) {
                sum = sum+digit;
            }
        }
        return sum;
    }

    public static int getOddSum(int num) {
        int sum = 0;
        for (int t = num; t > 0; t = t / 10) {
            int digit = t % 10;
            if (digit % 2 != 0) {
                sum = sum+digit;
            }
        }
        return sum;
    }

    public static void beautifulNo(int num) {
        if (getEvenCount(num) == getOddCount(num)) {
            System.out.println("Beautiful Number");
        }
    }

    public static void superNo(int num) {
        if(getEvenSum(num) == getOddSum(num)) {
        	System.out.println("Super Number");
        }
    }
}