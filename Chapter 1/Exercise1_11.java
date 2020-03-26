/**
 * Exercise1_11.java
 * Introduction to Java Programming
 *
 * Problem: (Population Projection) The U.S. Census Bureau projects population
 * based on the following assumptions:
 *
 * ■ One birth every 7 seconds
 * ■ One death every 13 seconds
 * ■ One new immigrant every 45 seconds
 *
 * Write a program to display the population for each of the next five years.
 * Assume the current population is 312,032,486 and one year has 365 days. Hint:
 * In Java, if two integers perform division, the result is an integer. The
 * fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and
 * 10 / 4 is 2 (not 2.5). To get an accurate result with the fractional part, one
 * of the values involved in the division must be a number with a decimal point.
 * For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 *
 * Copyright © 2018 - 2020 Ethan Dye. All rights reserved.
 */

public class Exercise1_11 {
	public static void main(String[] args) {
		int birth = 7;
		int death = 13;
		int immigrant = 45;
		int currentPopulation = 312032486;
		int year = 365;
		double yearlyBirths = Math.pow(60, 2) * 24 * year / birth;
		double yearlyDeaths = Math.pow(60, 2) * 24 * year / death;
		double yearlyImmigrants = Math.pow(60, 2) * 24 * year / immigrant;
		double yearlyPopulation = yearlyBirths + yearlyImmigrants
			- yearlyDeaths;

		System.out.println("Current Year Population = " + currentPopulation);
		System.out.println("Next Year's Population = " + currentPopulation
			+ yearlyPopulation);
		System.out.println("Next Two Year's Population = " + currentPopulation
			+ yearlyPopulation * 2);
		System.out.println("Next Three Year's Population = " + currentPopulation
			+ yearlyPopulation * 3);
		System.out.println("Next Four Year's Population = " + currentPopulation
			+ yearlyPopulation * 4);
		System.out.println("Next Five Year's Population = " + currentPopulation
			+ yearlyPopulation * 5);
	}
}
