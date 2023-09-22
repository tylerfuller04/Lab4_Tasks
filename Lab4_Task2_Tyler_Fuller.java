/*
 * Lab4_Task2_Tyler_Fuller.java
 * Tyler Fuller
 * 01261802
 * 09/22/23
 */

package Lab4_Task2_Tyler_Fuller;

import java.util.Scanner;

public class Lab4_Task2_Tyler_Fuller {

	public static void main(String[] args) {

		// Declare variables
		int popA, popB;
		double rateA, rateB;
		int year = 0;
		
		// Get user input for town populations and growth rates
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Town A population & growth rate: ");
		popA = input.nextInt();
		rateA = input.nextDouble();
		
		System.out.println("Enter Town B population & growth rate: ");
		popB = input.nextInt();
		rateB = input.nextDouble();	
		input.close();
	
		// Compute the town populations after one year and loop until Town A surpasses Town B
		while (popA < popB) {
			popA = (int)(popA * (1 + rateA / 100.0));
			popB = (int)(popB * (1 + rateB / 100.0));
			year++;
		}
		// Print the number of years it takes Town A to surpass Town B, and print their final populations
		System.out.println("After " + year + " years, the population Town A will be greater than or equal the population of Town B");
		System.out.println("After  " + year + " years the population of Town A is " + popA);
		System.out.println("After " + year + " years the population of Town B is " + popB);
	}

}
 