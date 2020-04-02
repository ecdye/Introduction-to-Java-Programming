/**
 * Exercise1_13.java
 * Introduction to Java Programming, AP Edition. 10th ed.
 *
 * Problem: (Algebra: solve 2 x 2 linear equations) You can use Cramer's rule
 * to solve the following 2 x 2 system of linear equasion provided that ad - bc
 * is not 0:
 *
 * ax + by = e     ed - bf     af - ec
 *             x = ------- y = -------
 * cx + dy = f     ad - bc     ad - bc
 *
 * Write a program that solves the following equasion and displays the value for
 * x and y: (Hint: replace the symbols in the formula with numbers to compute x
 * and y. This exercise can be done in Chapter 1 without using materials in later
 * chapters.)
 *
 * 3.4x + 50.2y = 44.5
 * 2.1x + .55y = 5.9
 *
 * Copyright © 2018 - 2020 Ethan Dye. All rights reserved.
 */

public class Exercise1_13 {
	public static void main(String[] args) {
		System.out.println("Solving for x and y using Cramer's rule with the"
			+ " following equations:");
		System.out.println("3.4x + 50.2y = 44.5");
		System.out.println("2.1x + .55y = 5.9");
		System.out.println("x = " + (44.5 * .55 - 50.2 * 5.9)
			/ (3.4 * .55 - 50.2 * 2.1));
		System.out.println("y = " + (3.4 * 5.9 - 44.5 * 2.1)
			/ (3.4 * .55 - 50.2 * 2.1));
	}
}
