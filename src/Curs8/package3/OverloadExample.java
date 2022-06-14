package Curs8.package3;

public class OverloadExample {
	
	/**
	 * Java Doc
	 * Method that multiplies two integer numbers
	 * @param a - int
	 * @param b - int
	 * @return - multiplication of a and b
	 */
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
	}

	public static void main(String[] args) {
		
		System.out.println(multiply(2, 3));
		System.out.println(multiply(2.5, 3.7));
		
		// polimorfism static
		System.out.println(1);  // data type = int
		System.out.println(1.2);  // data type = doublt
		System.out.println(true); // data type = boolean
		System.out.println("Test"); // data type = string
		System.out.println('c'); // data type = char

	}

}
