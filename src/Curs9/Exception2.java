package Curs9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Please enter number 1 : ");
			int num1 = scan.nextInt();
			System.out.println("Please enter number 2 : ");
			int num2 = scan.nextInt();
			//num2 = (Integer) null;
			int output = num1/num2;
			System.out.println("Result: " + output);
			System.out.println("Nu se mai executa daca am avut impartire la zero");
			
		} catch(ArithmeticException e) {
			System.out.println("You should not devide by zero!");
		} catch(InputMismatchException e) {
			System.out.println("You should input only integers!");
		} catch(NullPointerException e) {
			System.out.println("Null pointer occured!");
		}
		
		System.out.println("Am iesit din exception");
	}

}
