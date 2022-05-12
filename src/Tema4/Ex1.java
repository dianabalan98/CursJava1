package Tema4;

import java.util.Scanner;

public class Ex1 {
	
	public static void calculateSum() {
		
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<=10; i++) {
			System.out.println("Please insert number " +i+ ": ");
			sum += scan.nextInt();			
		}
		
		System.out.println("The sum of the 10 numbers is: " +sum);
		scan.close();
	}

	public static void main(String[] args) {
		
		calculateSum();
		
	}

}
