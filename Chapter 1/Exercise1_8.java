/**
 * Exercise1_8.java
 * Introduction to Java Programming
 *
 * Problem: (Area and perimeter of a circle) Write a program that displays the
 * area and perimeter of a circle that has a radius of 5.5 using the following
 * formula:
 *
 * perimeter = 2 * radius * π
 * area = radius * radius * π
 *
 * Copyright © 2018 - 2020 Ethan Dye. All rights reserved.
 */

import java.util.Scanner;

public class Exercise1_8 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double radius = input.nextDouble();
		input.close();
		double perimeter = 2 * radius * Math.PI;
		double area = radius * radius * Math.PI;
		System.out.println("perimeter = " + perimeter);
		System.out.println("area = " + area);
	}
}