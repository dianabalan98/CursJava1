package Tema3;

import java.util.Scanner;

public class Ex2 {
	
	int age;
	
	public void checkAge() {
		
		if(age < 18 && age >= 0) {
			
			System.out.println("Esti minor.");
		} else if(age >= 18 && age <= 65) {
			
			System.out.println("Esti adult.");			
		} else if (age > 65) {
			
			System.out.println("Esti batran.");	
		} else {
			
			System.out.println("Te rugam sa introduci un nr mai mare sau egal cu 0.");
		}
	}
	
	public void askTheUserTheirAge() {
		
		System.out.println("Introdu varsta ta (in ani) : ");
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
		checkAge();
		scan.close();
	}

	public static void main(String[] args) {
		
		Ex2 test = new Ex2();
		test.askTheUserTheirAge();

	}

}
