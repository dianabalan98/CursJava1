package Curs4;

import java.util.Scanner;

public class ConditionalOperator {
	
	/**
	 * Citeste 2 nr de la tastatura
	 * Verifica daca ambele nr sutn pozitive
	 * Verifica daca fiecare nr este pozitiv 
	 * Verifica care dintre cele 2 nr este cel mai mic
	 */

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert first number: ");
		num1 = scan.nextInt();
		System.out.println("Please insert second number: ");
		num2 = scan.nextInt();
		
		// verificam daca primul nr e pozitiv
		if(num1>0) {
			System.out.println("Num 1 is positive");
		} else {
			System.out.println("Num 1 is negative");
		}
			
		// verificam daca al doilea e pozitiv
		if(num2>0) {
			System.out.println("Num 2 is positive");
		} else {
			System.out.println("Num 2 is negative");
		}
			
		// verificam daca ambele sunt pozitive
		if(num1>0 && num2>0) {
			System.out.println("Both numbers are positive");
		} else {
			System.out.println("At least one number is negative");
		}
			
		// verificam care nr e cel mai mic
		if(num1<num2) {
			System.out.println("Num1 is the smallest");
		} else if(num1 == num2) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("Num2 is the smallest");
		}
		
		
		
		/**
		 * Varianta cu ternary operator
		 */
		String result;
		result = num1>0 ? "Num1 is positive" : "Num1 is negative";
		result = num2>0 ? "Num2 is positive" : "Num2 is negative";
		result = (num1>0) && (num2>0) ? "Both numbers are positive" : "At least one number is negative";
		result = num1 == num2 ? "Numbers are equal" : num1<num2 ? "Num1 is the smallest" : "Num2 is the smallest";
		
		
	}

}
