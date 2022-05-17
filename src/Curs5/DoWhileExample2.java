package Curs5;

import java.util.Scanner;

public class DoWhileExample2 {
	
	/**
	 * Intrebam utilizatorul un nr
	 * Inmultim nr cu 10
	 * Printam rezultatul operatiei
	 * Intrebam alt nr, pana cand utilizatorul introduce nr 0 si atunci iesim din program
	 */

	public static void main(String[] args) {
		
		int nr;
		Scanner scan = new Scanner(System.in);
				
		do {
			System.out.println("Enter a nr: ");
			nr = scan.nextInt();
			System.out.println(nr + " * 10 = " + nr*10);
			
		} while(nr!=0);
		
		
		scan.close();
		

	}

}
