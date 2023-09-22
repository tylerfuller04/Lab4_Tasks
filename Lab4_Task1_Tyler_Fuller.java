/*
 * Lab4_Task1_Tyler_Fuller.java
 * Tyler Fuller
 * 01261802
 * 09/20/23
 */

package Lab4_Task1_Tyler_Fuller;

import java.util.Scanner;

public class Lab4_Task1_Tyler_Fuller {
		
	public static void main(String[] args) {
	    
	    // Declare variables
	    int num1, num2, max, min;
	    char looper = '1';
    	Scanner input = new Scanner(System.in);
	    
	    // Do-while loop
	    do {
	    	// Get input from user for two numbers
	    	System.out.println("Enter two numbers to determine divisibility: ");
		    num1 = input.nextInt();
		    num2 = input.nextInt();
		   
		    // Determine max and min of the two numbers
		    max = Math.max(num1, num2);
		    min = Math.min(num1, num2);
		    
		    // Test if larger number is divisible by smaller number
		    if (max % min == 0) {
		        System.out.printf("%d is %d times bigger than %d\n", max, max / min, min);
		    }
		    
		    // Else not divisible
		    else {
		    	System.out.println("Not divisible");
		    }
		    
		    // Ask the user if they want to repeat the program
		    System.out.print("Run again? Yes (1) No (anything else)");
		    looper = input.next().charAt(0);
		    
	    }
	    // If user input = 1, loop runs again
	    while(looper == '1');
	    input.close();
	    
	}
}
