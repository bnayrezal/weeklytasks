/**
 * 
 */
package com.itsutra.assignmentweek1;

import java.util.Scanner;

/**
 * @author bnayr
 * 
 */
public class MuffinPriceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int qtyOfMuffin = 0;

		double bluberryMuffin = 2.98;
		double chocolateMuffin = 4.50;
		double bananaMuffin = 9.98;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose Muffins:\n" + "1 = Blueberry Muffin\n"
				+ "2 = Chocolate Muffin\n" + "3 = Banana Muffin\n");

		int chosenMuffin = scanner.nextInt();

		if (chosenMuffin <= 3) {
			System.out.println("How many muffin you want to buy? ");
			qtyOfMuffin = scanner.nextInt();

			switch (chosenMuffin) {
			case 1:
				System.out.println("You purchased " + qtyOfMuffin
						+ " Blueberry Muffin.");
				System.out.println("You should pay $" + bluberryMuffin
						* qtyOfMuffin);
				break;

			case 2:
				System.out.println("You purchased " + qtyOfMuffin
						+ " Chocolate Muffin.");
				System.out.println("You should pay $" + chocolateMuffin
						* qtyOfMuffin);
				break;

			case 3:
				System.out.println("You purchased " + qtyOfMuffin
						+ " Banana Muffin.");
				System.out.println("You should pay $" + bananaMuffin
						* qtyOfMuffin);
				break;

			default:
				System.out.println("Sorry! we don't serve that number");
				break;
			}

		} else {
			System.out.println("Choose Muffins:\n" + "1 = Blueberry Muffin\n"
					+ "2 = Chocolate Muffin\n" + "3 = Banana Muffin\n");

			chosenMuffin = scanner.nextInt();
			System.out.println("Hey! Only 1-3 is Allowed!! ");

		}

		scanner.close();

	}

}
