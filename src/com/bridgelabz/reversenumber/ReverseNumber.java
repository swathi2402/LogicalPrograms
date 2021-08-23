package com.bridgelabz.reversenumber;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 1996;
		System.out.print("The reverse of " + number + " is: ");
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.print(reverse);
	}

}
