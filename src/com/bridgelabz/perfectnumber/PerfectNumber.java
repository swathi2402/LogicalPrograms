package com.bridgelabz.perfectnumber;

public class PerfectNumber {
	public static void main(String args[]) {
		int number = 496;
		int sum = 0;
		int factor = 1;
		while (factor <= number / 2) {
			if (number % factor == 0) {
				sum = sum + factor;
			} 
			factor++;
		}
		if (sum == number) {
			System.out.println(number + " is a perfect number.");
		} 
		else {
			System.out.println(number + " is not a perfect number.");
		}
	}
}
