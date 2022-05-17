package Curs5;

import java.util.Scanner;

public class DiceGame {
	
	/**
	 * Reguli joc zaruri:
	 * daca userul da in total: 2, 6, 12 --> pierde --> break
	 * daca userul da in total: 7, 11 --> castiga --> break
	 * daca userul da in total: 3, 10 --> repeta aruncarea automat --> continue
	 * daca da alta varianta il intrebam daca mai vrea sa dea o data
	 * raspunsul trebuie sa fie boolean
	 */

	public static void main(String[] args) {
		
		boolean condition = true;
		
		while(condition) {
			int dice1 = (int) (Math.random() * 6+1);
			int dice2 = (int) (Math.random() * 6+1);
			int total = dice1 + dice2;
			
			System.out.println("Ai dat : " + total);
			
			if(total == 2 || total == 6 || total == 12) {
				System.out.println("Ai dat : " + total + ". Ai pierdut!");
				break;
			} else if (total == 7 || total == 11) {
				System.out.println("Ai dat : " + total + ". Ai castigat!");
				break;
			} else if (total == 3 || total == 10) {
				System.out.println("Ai dat : " + total + ". Automat mai dai o data!");
				continue;
			}
			
			System.out.println("Mai dai o data?");
			Scanner scan = new Scanner(System.in);
			condition = scan.nextBoolean();
		}
		
		System.out.println("Game over");

	}

}
