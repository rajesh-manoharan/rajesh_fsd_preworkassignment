import java.util.Scanner;

public class preWorkAssignment {
	public static void main(String args[]) {

		System.out.println("Please enter the choice as required");
		System.out.println("1. Check a number is a palindrome");
		System.out.println("2. Print a star pattern");
		System.out.println("3. Check a number is a prime or not");
		System.out.println("4. Print Fibonacci series");
		System.out.println("0. Exit");
		System.out.println("-------------------------------------");

		Scanner userInput = new Scanner(System.in);
		int userOption = 0;

		boolean validUserOption = userInput.hasNextInt();
		if (validUserOption)
			userOption = userInput.nextInt();
		else
			System.out.println("Enter a valid option!!!!");

		switch (userOption) {
		case 0: {
			System.out.println("Exiting the program, Thank you!");
			break;
		}
		case 1: {
			preWorkSubFunction input = new preWorkSubFunction();
			System.out.println("Please enter the number to check for palindrome");
			Scanner userInputNumber = new Scanner(System.in);
			if (userInputNumber.hasNextInt()) {
				int checkPalindrome = userInputNumber.nextInt();
				input.setpreWorkSubfunction(checkPalindrome);
				input.checkPalindrome();
			} else {
				System.out.println("Please enter a valid number");
			}
			userInputNumber.close();
			break;
		}
		case 2: {
			preWorkSubFunction input = new preWorkSubFunction();
			System.out.println("Please enter the number to do the Star Pattern");
			Scanner userInputNumber = new Scanner(System.in);
			if (userInputNumber.hasNextInt()) {
				int starPattern = userInputNumber.nextInt();
				input.setpreWorkSubfunction(starPattern);
				input.printStarPattern();
			} else {
				System.out.println("Please enter a valid number");
			}
			userInputNumber.close();
			break;
		}
		case 3: {
			preWorkSubFunction input = new preWorkSubFunction();
			System.out.println("Please enter the number to check for prime");
			Scanner userInputNumber = new Scanner(System.in);
			if (userInputNumber.hasNextInt()) {
				int checkPrime = userInputNumber.nextInt();
				input.setpreWorkSubfunction(checkPrime);
				input.checkprimenum();
			} else {
				System.out.println("Please enter a valid number");
			}
			userInputNumber.close();
			break;
		}
		case 4: {
			preWorkSubFunction input = new preWorkSubFunction();
			System.out.println("Please enter the end number for fibonacci series");
			Scanner userInputNumber = new Scanner(System.in);
			if (userInputNumber.hasNextInt()) {
				int fibonacciEnd = userInputNumber.nextInt();
				input.setpreWorkSubfunction(fibonacciEnd);
				input.printFibonacciSeries();
			} else {
				System.out.println("Please enter a valid number");
			}
			userInputNumber.close();
			break;
		}
		default: {
			System.out.println("Invalid option selected");
			System.out.println("Exiting the program, Thank you!");
		}
		}
		userInput.close();
	}
}
