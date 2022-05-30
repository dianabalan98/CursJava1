package Tema5;

import java.util.Scanner;

public class Ex1 {

	/**
	 * 
	 * Do while login with 3 attempts
	 */
	
	public static void main(String[] args) {
		
		int attempts = 3;
		int validPassword = 1234;
		String validUsername = "TestUser";
		
		try (Scanner scan = new Scanner(System.in)) {
			do {
				
				System.out.println("Please enter your credentials (" + attempts + " attempts left): ");
				System.out.println("\nUsername: ");
				String username = scan.next();
				System.out.println("\nPassword: ");
				int password = scan.nextInt();
				
				if(username.equals(validUsername) && password == validPassword) {
					System.out.println("\nLogin Successful!");
					return;
				} else {
					System.out.println("\nLogin Error!");
					attempts--;
					continue;
				}
				
			} while(attempts > 0);
			
			System.out.println("\nMaximum attempts reached. User blocked.");
			scan.close();
		}
		
	}

}
