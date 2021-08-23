package com.bridgelabz.primenumber;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 20;
		int isPrime = 0;
		int middleValue = number / 2;
		
		if (number == 0 || number == 1) {
			System.out.println(number + " is not prime number");
		} 
		else {
			for (int index = 2; index <= middleValue; index++) {
				if (number % index == 0) {
					System.out.println(number + " is not prime number");
					isPrime = 1;
					break;
				}
			}
			if (isPrime == 0) {
				System.out.println(number + " is prime number");
			}
		}
	}
}
