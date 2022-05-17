package Curs5;

public class DoWhileExample {

	public static void main(String[] args) {
		
		String[] myArray = {"zero", "one", "two", "three", "four"};
		int i = 0;
		
		do {
			
			System.out.println(myArray[i]);
			i++;
			
		} while(i > myArray.length);
		
	}

}
