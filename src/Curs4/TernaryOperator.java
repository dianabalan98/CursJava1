package Curs4;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		int num3 = 2;
		
		int x = (num1>num2) ? num2 : num1;
		System.out.println(x);
		
		// operatorul ternar poate fi si nested dar e greu de citit
		x = (num1>num2)?num1:(num2<num3?num2:num3);
	}

}
