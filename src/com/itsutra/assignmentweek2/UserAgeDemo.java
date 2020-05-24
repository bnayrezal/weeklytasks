/**
 * 
 */
package com.itsutra.assignmentweek2;

import java.util.Scanner;

/**
 * @author bnayr
 * 
 */
public class UserAgeDemo {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		int currentYear = 2020;
		int userAge = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Your Age: ");

		if (!scanner.hasNextInt()) {
			throw new MyOwnNumberFormatException("ERROR!! NOT a NUMBER!!!");
		}

		userAge = scanner.nextInt();

		System.out.println("You were born on: " + (currentYear - userAge));

		scanner.close();

	}

}

// custom exception
class MyOwnNumberFormatException extends Exception {
	MyOwnNumberFormatException(String s) {
		super(s);
	}
}
