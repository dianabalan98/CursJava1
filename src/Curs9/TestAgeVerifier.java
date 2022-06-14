package Curs9;

import java.util.Scanner;

public class TestAgeVerifier {

	public static void main(String[] args) throws CustomAgeException {
		
		AgeVerifier ageVerifier = new AgeVerifier();
		System.out.println("Please enter your age:");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		ageVerifier.checkAgeLimit(age);

	}

}
