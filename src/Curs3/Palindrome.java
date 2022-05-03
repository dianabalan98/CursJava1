package Curs3;

public class Palindrome {

	// verification through equals()
	
	public void checkIfPalindrome(String word) {
		
		String backwardsWord = "";
		for(int i=word.length()-1; i>=0; i--) {
			backwardsWord += word.charAt(i);
		}
		
		if (word.equals(backwardsWord)) {
			
			System.out.println("The word " + word + " is a palindrome!");
		} else {
			System.out.println("The word " + word + " is not a palindrome!");
		}
	}
	
}
