/**
 * 
 */
package com.itsutra.assignmentweek2;

import java.util.Scanner;

/**
 * @author bnayr
 * 
 */
public class TimeFormatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int hour, minute, second;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter time in seconds: ");
		int inputTime = scanner.nextInt();

		System.out.println("Hour is: " + (inputTime / (60 * 60)));
		System.out.println("Minute is: " + (inputTime % (60 * 60)) / 60);
		System.out.println("Second is: " + (inputTime % (60)));

		scanner.close();

	}

}
