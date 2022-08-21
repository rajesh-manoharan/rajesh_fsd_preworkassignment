
public class preWorkSubFunction {
	
	private int inputNumber;
	
	public void setpreWorkSubfunction(int inputNumber){
		this.inputNumber = inputNumber;
	}
	
	public void checkPalindrome() {
		int work_number = inputNumber;
		int reverse_number = 0;
		int remainder_number = 0;
		while (work_number > 0) {
			remainder_number = work_number % 10;
			reverse_number *= 10;
			reverse_number += remainder_number;
			work_number /= 10;
		}

		if (inputNumber == reverse_number)
			System.out.println("Number " + inputNumber + " is a palindrom number");
		else
			System.out.println("Number " + inputNumber + " is NOT a palindrom number");
	}

	public void printStarPattern() {

		int starPattern;
		while (inputNumber > 0) {
			for (starPattern = inputNumber; starPattern > 0; starPattern--) {
				System.out.print("*");
			}
			inputNumber--;
			System.out.println("");
		}
	}

	public void checkprimenum() {
		int primeremainder;
		int checkNumber;
		boolean primeNumind = true;
		if (inputNumber <= 1)
			primeNumind = false;
		else {
			for (checkNumber = 2; checkNumber < inputNumber; checkNumber++) {
				primeremainder = inputNumber % checkNumber;
				if (primeremainder == 0) {
					primeNumind = false;
					break;
				} else
					continue;
			}
		}
		if (primeNumind)
			System.out.println(inputNumber + " is a prime number");
		else
			System.out.println(inputNumber + " is not a prime number");
	}

	public void printFibonacciSeries() {

		int firstNumber = 0;
		int secondNumber = 1;
		int fibonacciVariable;
		int endVariable;
		if (inputNumber <= 0) {
			System.out.println("Invalid number for fibonacci series");
			return;
		}

		System.out.println("Fibonacci series");

		switch (inputNumber) {
		case 1: {
			System.out.println(firstNumber);
			break;
		}
		case 2: {
			System.out.println(firstNumber);
			System.out.println(secondNumber);
		}
		default: {
			System.out.println(firstNumber);
			System.out.println(secondNumber);
			for (endVariable = 3; endVariable <= inputNumber; endVariable++) {
				fibonacciVariable = firstNumber + secondNumber;
				System.out.println(fibonacciVariable);
				firstNumber = secondNumber;
				secondNumber = fibonacciVariable;
			}
		}
		}

	}
}
