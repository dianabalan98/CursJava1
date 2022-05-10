package Curs4;

import java.util.Scanner;

public class ForVsWhileExample {

	/**
	 * Programul cere utilizatorului numere
	 * inmulteste acele nr cu 10
	 * cand utilizatorul introduce 0 iesim din program
	 */
	
	public static void rezolvareCuFor() {   // preferabil cand avem nevoie de indecsi
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert a number: ");
		
		int val = 0;
		
		for(int i = scan.nextInt(); i!=0; i=scan.nextInt()) {
			i *= 10;
			System.out.println("Please insert a number: ");
			System.out.println(i);
			
		}
	}
	
	public static void rezolvareCuWhile() {  //preferabil pt validari booleene
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert a number: ");
		
		int i = scan.nextInt();
		while(i!=0) {
			
			i*=10;
			System.out.println("Please enter a number");
			System.out.println(i);
			i = scan.nextInt();
		}
	}
	
	
	public static void main(String[] args) {
		
		//rezolvareCuFor();
		rezolvareCuWhile();
		
	}
	
	

}
