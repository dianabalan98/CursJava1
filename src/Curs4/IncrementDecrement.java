package Curs4;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		// num++ --> post increment
		// num = num + 1
		// ++num --> pre increment
		// num = num + 1
		
		System.out.println("-------------------POST---------------------");
		int num = 10;
		System.out.println("Valoarea lui num inainte de increment: " + num);
		System.out.println("Valoarea lui num in post increment: " + num++); // num = num + 1 = 10 + 1 = 11 -> se face dupa evaluarea expresiei
		System.out.println("Valoarea lui num dupa post increment: " + num); // de abia aici va fi 11
		
		System.out.println("-------------------PRE---------------------");
		int num2 = 10;
		System.out.println("Valoarea lui num inainte de increment: " + num2);
		System.out.println("Valoarea lui num in post increment: " + ++num2);
		System.out.println("Valoarea lui num dupa post increment: " + num2); 

	}

}
