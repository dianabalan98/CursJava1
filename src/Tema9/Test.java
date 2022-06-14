package Tema9;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws InsuficientFundsException {
		
		Customer customer1 = new Customer("Stefan", "Plevnei nr. 8", "stefan@mail.com");
		SavingsAccount sa = new SavingsAccount(123456789, 350.50, customer1);
		
		System.out.println("Hi " + customer1.getName());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the amount to widraw: ");
		
		sa.withdraw(scan.nextDouble());
		scan.close();

	}

}
