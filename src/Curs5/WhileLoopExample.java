package Curs5;

import java.util.Scanner;

public class WhileLoopExample {

	/**
	 * Program care calculeaza salariul pe o saptamana
	 * Intrebam utilizatorul cate ore a lucrat
	 * Calculam daca a lucrat maxim 40 de ore pe sapt si minim 1 ora pe sapt respectiva
	 * Daca introduce un nr invalid il rugam sa introduca din nou
	 * Rate per hour este 15 EUR
	 */
	
	public static void main(String[] args) {
		
		// ce stim 
		int maxNrHoursWorked = 40;
		int ratePerHour = 15;
		
		// ce nu stim
		System.out.println("Cate ore ai lucrat saptamana aceasta ? ");
		Scanner scan = new Scanner(System.in);
		int hoursWorked = scan.nextInt();
		
		// validarea
		while(hoursWorked < 1 || hoursWorked > maxNrHoursWorked) {
			
			System.out.println("Numarul este invalid. Te rog introdu un nr in intervalul 1-40 ore: ");
			hoursWorked = scan.nextInt();
		}
		
		System.out.println("Ai lucrat in total: " + hoursWorked + " ore.");
		System.out.println("Salariul tau pe aceasta saptamana: " + hoursWorked * ratePerHour);
		scan.close();
	}

}
