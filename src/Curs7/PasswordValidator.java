package Curs7;

import java.util.Scanner;

public class PasswordValidator {
		
	/*
	 * Program care valideaza o parola pe baza unor reguli:
	 * Reguli:
	 * 1. Parola trebuie sa contina min 10 chars.
	 * 2. Parola trebuie sa contina o litera uppercase.
	 * 3. Parola nu trebuie sa fie la fel ca username.
	 * 
	 * Intrebam utilizatorul username-ul si parola.
	 * Informam utilizatorul care sunt regulile.
	 * - Dupa aceea validam parola si informam utilizatorul ce nu a respectat regulile de mai sus.
	 * - Daca parola e valida, printam "Parola propusa este valida."
	 * 
	 * Spargem logica programului in cat mai multe metode posibile.
	 * Logica de validare o tinem intr-un do-while.
	 */
	
	
	/*
	 * Identificam ce avem nevoie:
	 * 
	 * --> ce stim
	 * 		Regulile (metoda)
	 * 		Cerem user si parola (metoda) 
	 * 
	 * --> ce trebuie sa aflam
	 * 		Daca parola e valida
	 * 
	 * --> ce trebuie sa validam
	 * 		Regulile
	 */
	
	Scanner scanner = new Scanner(System.in);
	boolean valid;
	
	public static void printPasswordRules() {
		
		System.out.println("Reguli parola:");
		System.out.println("1. Parola trebuie sa contina minim 10 caractere.");
		System.out.println("2. Parola trebuie sa contina o litera majuscula.");
		System.out.println("3. Parola nu trebuie sa fie la fel ca username.");
	}
	
	public String getProposedPassword() {
		
		System.out.println("Introdu parola: ");
		return scanner.nextLine();
	}
	
	public String getUsername() {
		
		System.out.println("Introdu username: ");
		return scanner.nextLine();
	}
	
	public boolean isValid() {
		
		return valid;
	}
	
	public void checkPasswordRules(String password, String username) {
		valid = true;
		
		if(password.length() < 10) {
			valid = false;
			System.out.println("Parola trebuie sa contina cel putin 10 caractere!");		
		}
		if(password.equals(password.toLowerCase())) {
			valid = false;
			System.out.println("Parola trebuie sa contina cel putin 1 litera majusula!");		
		}
		if(password.equalsIgnoreCase(username)) {
			valid = false;
			System.out.println("Parola nu trebuie sa fie la fel ca si username!");	
		}
	}
	
	

	public static void main(String[] args) {
		
		PasswordValidator validator = new PasswordValidator();
		printPasswordRules();
		
		do {
			
			validator.checkPasswordRules(validator.getProposedPassword(), validator.getUsername());
			
		} while(!validator.isValid());
		
		System.out.println("Parola propusa este valida!");
	}

}
