/**
 * Exercise1_12.java
 * Introduction to Java Programming
 *
 * Problem: (_Average speed in kilometers_) Assume a runner runs 24 miles in
 * 1 hour, 40 minutes, and 35 seconds. Write a program that displays the average
 * speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)
 *
 * Copyright © 2018 - 2020 Ethan Dye. All rights reserved.
 */

public class Exercise1_12 {
	public static void main(String[] args) {
		double kilometers = 24 * 1.6;
		double hours = 1 + (40.0 * 60.0 + 35.0) / 3600;
		double kph = kilometers / hours;
		System.out.println("24 miles run in 1 hour, 40 minutes, and 35 seconds"
		 	+ " is = " + kph + " kph");
	}
}
