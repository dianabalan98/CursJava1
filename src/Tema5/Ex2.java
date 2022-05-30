package Tema5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
	
	public void fibonacciFor(int count) {
		
		int number1 = 0;
		int number2 = 1;
		
		System.out.print("Fibonacci Series of " + count + " numbers using FOR structure:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(number1 + " ");
            int predecessorSum = number1 + number2;
            number1 = number2;
            number2 = predecessorSum;
        }		
	}
	
	public void fibonacciWhile(int count) {
		
		int number1 = 0;
		int number2 = 1;
		
		System.out.print("\nFibonacci Series of " + count + " numbers using WHILE structure:");
		
		while(count > 0) {
			
			System.out.print(number1 + " ");
			int predecessorSum = number1 + number2;
            number1 = number2;
            number2 = predecessorSum;
			count--;
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("Introdu un numar: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		Ex2 obj = new Ex2();
		obj.fibonacciFor(number);
		obj.fibonacciWhile(number);
		
		scan.close();
	}

}
