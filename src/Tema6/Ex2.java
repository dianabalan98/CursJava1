package Tema6;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		int count = 0;
		System.out.println("Introdu o propozitie: ");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine().toLowerCase();
		System.out.println("Propozitia ta: " + sentence);
		
		for (int i=0 ; i<sentence.length(); i++){
			char ch = sentence.charAt(i);
			if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
				count ++;
			}
	    }
		
		System.out.println("Nr vocale din text: " + count);		
		scan.close();

	}

}
