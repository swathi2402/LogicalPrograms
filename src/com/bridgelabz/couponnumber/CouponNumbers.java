package com.bridgelabz.couponnumber;

public class CouponNumbers {

	public static void main(String[] args) {
		int number = 10;
        boolean[] distinctValue = new boolean[number]; 
        int count = 0;
        int distinct = 0;
        System.out.println("The distinct " + number + " numbers are: ");
        while (distinct < number) {
            int value = (int) (Math.random() * number);   
            count++;                                 
            if (!distinctValue[value]) {
                distinct++;
                distinctValue[value] = true;
                System.out.println(value);
            }
        }

        System.out.println("Total count to get " + number + " distinct number is " + count);
	}

}
