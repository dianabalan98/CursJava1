package Curs9;

import java.util.Scanner;

public class Exception3 {

	public static void main(String[] args) {
		
		String nume = null;
		int[] array = {1, 2, 3, 4};
		
		try {
			
			System.out.println(nume.length());
			try {
				int x = 2;
				System.out.println(array[x]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index out of bounds!");
			} catch(Exception e) {
				System.out.println("Exception occured!");
			}
		} catch(NullPointerException e) {
			System.out.println("Null pointer occured");
		}

	}

}
