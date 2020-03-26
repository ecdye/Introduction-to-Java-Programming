/**
* Exercise1_10.java
* Introduction to Java Programming
*
* Problem: (Average speed in miles) Assume a runner runs 14 kilometers in
* 45 minutes and 30 seconds. Write a program that displays the average speed in
* miles per hour. (Note that 1 mile is 1.6 kilometers.)
*
* Copyright © 2018 - 2020 Ethan Dye. All rights reserved.
*/

public class Exercise1_10 {
	public static void main(String[] args) {
		System.out.println("Average speed of runner in mph ≈ " + (14.0 / 1.6)
			/ (((45.0 * 60.0) + 30.0) / 3600));
	}
}
