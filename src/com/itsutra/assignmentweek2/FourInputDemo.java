/**
 * 
 */
package com.itsutra.assignmentweek2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bnayr
 * 
 */
public class FourInputDemo {
	static int[] numbersInput = new int[4];

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arrayPos = 0;

		System.out.println("Enter 4 Numbers between 30-50 ONLY!!");

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt() && arrayPos < 4) {
			System.out.print("Enter a Number: ");
			int inputNumber = scanner.nextInt();

			if (inputNumber < 30 || inputNumber > 50) {
				System.err.println("No must be of range 30-50");

			} else if (isPresentInArray(inputNumber)) {
				System.err.println(inputNumber + " Already Present");

			} else {
				numbersInput[arrayPos] = inputNumber;
				arrayPos += 1;
				System.out.println(Arrays.toString(numbersInput));

			}

		}

		scanner.close();

	}

	// this method will check if the number is already entered or not.
	private static boolean isPresentInArray(int inputNumber) {
		System.out.println("its here");
		return Arrays.asList(numbersInput).contains(inputNumber);
	}

}
