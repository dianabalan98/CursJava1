package Curs3;

import java.util.Scanner;

public class Calculator {

	/**
	 * Calculator pt operatiile de baza: +, -, *, / cu 2 numere
	 * Intrebam userul primul numar
	 * Intrebam operatia matematica pe care vrea sa o execute
	 * Intrebam al doilea numar
	 * Printam numerele, operatia si rezultatul: Ex 2 + 3 = 5;
	 */
	
	int nr1, nr2, result;
	char operation;
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert the first number:");
		nr1 = scan.nextInt();
		System.out.println("Please enter the operation:");
		operation = scan.next().charAt(0);
		System.out.println("Please insert the second number:");
		nr2 = scan.nextInt();
		scan.close();
	}
	
	public void calculateValues() {
		
		if(operation == '+') {
			
			result = nr1 + nr2;
			
		} else if (operation == '-') {
			
			result = nr1 - nr2;
			
		} else if (operation == '*' || operation == 'x') {
			
			result = nr1 * nr2;
			
		} else if (operation == '/') {
			
			result = nr1 / nr2;
			
		} else {
			System.out.println("The operation is not supported.");
			return;
		}
		
		printResult();
		return;
	}
	
	public void printResult() {
		
		System.out.println(nr1 + " " + operation + " " + nr2 + " = " + result);
	}
}
