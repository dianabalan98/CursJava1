package Curs5;

import java.util.Scanner;

public class SwitchExample {
	
	/**
	 * Intrebam userul ce calificativ a obtinut
	 * Printam un mesaj pe baza calificativului
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu ce nota ai luat: ");
		String nota = scan.next();
		
		switch(nota.toUpperCase()) {
		
		case "A" : 	
			System.out.println("Felicitari!");
			break;
		case "B" : 	
			System.out.println("Destul de bine!");
			break;
		case "C" : 	
			System.out.println("Suficient!");
			break;
		case "D" : 	
			System.out.println("Insuficient!");
			break;
		default : 	
			System.out.println("Nota invalida!");
		}

	}

}
