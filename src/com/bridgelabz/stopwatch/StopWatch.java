package com.bridgelabz.stopwatch;

import java.util.Scanner;

public class StopWatch {

	static double start = 0, stop = 0;

	static void startTime() {
		start = System.currentTimeMillis();
		System.out.println("Time started at: " + start);
	}

	static void stopTime() {
		stop = System.currentTimeMillis();
		System.out.println("Time stopped at: " + stop);
	}

	static void elapsedTime() {
		System.out.println("Elapsed time is: " + (stop - start) / 1000);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press '1' to start: ");
		scanner.next();
		startTime();
		System.out.println("Press '2' to stop: ");
		scanner.next();
		stopTime();
		elapsedTime();
		scanner.close();
	}

}
