package Curs3;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
	
	int number1, number2, number3;
	
	public void askTheUserForThreeNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert the first number: ");
		number1 = scan.nextInt();
		System.out.println("Please insert the second number: ");
		number2 = scan.nextInt();
		System.out.println("Please insert the third number: ");
		number3 = scan.nextInt();
		
		scan.close();
	}
	
	public void compareThreeNumbers() {
		
		if(number1 > number2 && number1 > number3) {
			
			System.out.println("Number 1 is the greatest!");
			
		} else if(number2 > number3 && number2 > number1) {
			
			System.out.println("Number 2 is the greatest!");
			
		} else if(number3 > number2 && number3 > number1) {
			
			System.out.println("Number 3 is the greatest!");
		} else {
			
			System.out.println("Some of the numbers are equal.");
		}
	}
}
