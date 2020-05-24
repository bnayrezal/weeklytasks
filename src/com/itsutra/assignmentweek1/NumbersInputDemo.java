/**
 * 
 */
package com.itsutra.assignmentweek1;

import java.util.Scanner;

/**
 * @author bnayr
 * 
 */
public class NumbersInputDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// to count Number of zero inputs
		int zeroInput = 0;
		// to count Number of negative number inputs
		int negativeNumber = 0;

		Scanner scanner = new Scanner(System.in);

		// get user input
		System.out.println("Enter 1st number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter 2nd number: ");
		int secondNumber = scanner.nextInt();
		System.out.println("Enter 3rd number: ");
		int thirdNumber = scanner.nextInt();

		scanner.close();

		// 4.a. Display User Input
		System.out.println("1st number=" + firstNumber);
		System.out.println("2nd number=" + secondNumber);
		System.out.println("3rd number=" + thirdNumber);

		// 4.b Number of negative inputs

		// check for positivity of firstNumber
		if(firstNumber == 0 ) {
			zeroInput++;
			System.out.println(firstNumber + " is Zero");
		}
		else if (firstNumber < 0) {
			negativeNumber++;
			System.out.println(firstNumber + " is -ve");

		} else {
			System.out.println(firstNumber + " is +ve");
		}

		// check for positivity of secondnumber
		if(secondNumber == 0 ) {
			zeroInput++;
			System.out.println(secondNumber + " is Zero");
		}
		else if (secondNumber < 0) {
			negativeNumber++;
			System.out.println(secondNumber + " is -ve");

		} else {
			System.out.println(secondNumber + " is +ve");
		}

		// check for positivity of secondnumber
		if(thirdNumber == 0 ) {
			zeroInput++;
			System.out.println(thirdNumber + " is Zero");
		}
		else if (thirdNumber < 0) {
			negativeNumber++;
			System.out.println(thirdNumber + " is -ve");

		} else {
			System.out.println(thirdNumber + " is +ve");
		}

		System.out.println("The Number of Zero Input are: " + zeroInput);
		System.out.println("The Number of Negative Numbers are: "
				+ negativeNumber);
		System.out.println("The Number of Positive Numbers are: "
				+ (3 - zeroInput - negativeNumber));

	}

}
