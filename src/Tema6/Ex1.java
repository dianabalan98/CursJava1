package Tema6;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int length = 10;
		int[] numArray = new int[length];
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu 10 numere: ");
		
		for(int i=0; i<length; i++) {
			
			numArray[i] = scan.nextInt();
			sum += numArray[i];
		}
		
		System.out.println("Suma numerelor din array este: " + sum);
		
		scan.close();
	}

}
