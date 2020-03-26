/**
 * Exercise1_9.java
 * Introduction to Java Programming
 *
 * Problem: (Area and perimeter of a rectangle) Write a program that displays the
 * area and perimeter of a rectangle with the width of 4.5 and a height of 7.9
 * using the following formula:
 *
 * area = width * height
 *
 * Copyright © 2018 - 2020 Ethan Dye. All rights reserved.
 */

public class Exercise1_9 {
	public static void main(String[] args) {
		double area = 4.5 * 7.9;
		double perimeter = ((4.5 * 2) + (7.9 * 2));
		System.out.println("area = " + area);
		System.out.println("perimeter = " + perimeter);
	}
}
