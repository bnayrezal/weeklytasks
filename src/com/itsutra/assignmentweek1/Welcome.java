/**
 * 
 */
package com.itsutra.assignmentweek1;

import java.util.Scanner;

/**
 * @author bnayr
 * 
 */
public class Welcome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your Name: ");
		String username = scanner.next();

		System.out.println(username + " welcome to class");

		scanner.close();

	}

}
