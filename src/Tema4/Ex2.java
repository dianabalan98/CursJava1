package Tema4;

import java.util.Scanner;

public class Ex2 {

	public static void printMultiplicationTable() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = scan.nextInt();	
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(num + " * " + i + " = " + num*i);
				
		}
		
		scan.close();
		
	}
	
	public static void main(String[] args) {
		
		printMultiplicationTable();

	}

}
