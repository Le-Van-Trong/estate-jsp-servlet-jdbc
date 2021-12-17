package banvien;

import java.util.Scanner;

public class in_out {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner( System.in );
		int number1; // first number to add
		int number2; // second number to add
		int sum; // sum of number1 and number2
		System.out.print( "Enter first integer: " ); // prompt
		number1 = input.nextInt(); // read first number from user
		System.out.print( "Enter second integer: " ); // prompt
		number2 = input.nextInt(); // read second number from user
		sum = number1 + number2; // add numbers, then store total in sum
		System.out.printf( "Sum is %d\n", sum ); // display sum
		
		System.out.print("Tutorial ");
		System.out.print("Links");
		System.out.println("Tutorial ");
		System.out.println("Links");
	}
	
}

