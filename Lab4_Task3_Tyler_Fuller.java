/*
 * Lab4_Task3_Tyler_Fuller.java
 * Tyler Fuller
 * 01261802
 * 09/20/23
 */

package Lab4_Task3_Tyler_Fuller;

import java.util.Scanner;

public class Lab4_Task3_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Declare variables
		int integer;
		
		// Get a number from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		integer = input.nextInt();
		input.close();
		
		// Determine if integer is divisible by anything less than or equal to its square root 
		int i = 2;
		while (i <= Math.sqrt(integer)) {
			if (integer % i == 0) {
				System.out.println("This number is not prime");
				return;
			}
			i++;
		}
		// If we break out of the while loop, then the number is prime
		System.out.println("This number is prime");
	}

}
