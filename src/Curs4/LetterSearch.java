package Curs4;

import java.util.Scanner;

public class LetterSearch {

	/**
	 * 
	 * citim de la tastatura un text
	 * cautam o anumita litera in el (A)
	 * daca o gasim printam ca am gasit litera si nr de cate ori am gasit litera
	 * daca nu o gasim printam ca nu am gasit litera
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		char letter = 'A';
		int counter = 0;
		
		for(int i=0; i<text.length(); i++) {
			
			char cLetter = text.charAt(i);
			if(cLetter == letter || cLetter == 'a') {
				counter++; 
			}
		}
		
		String result = counter > 0 ? "Letter " + letter + " appeared " + counter + " times." : "The letter " +letter+" was not found.";
		System.out.println(result);
	}

}
