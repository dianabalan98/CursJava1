package Curs9;

public class AgeVerifier {

	public void checkAgeLimit(int age) throws CustomAgeException {
		if(age<18) {
			
			throw new CustomAgeException("Invalid age to proceed further!");
		} else {
			
			System.out.println("You are not allowed to proceed!");
		}
	}
}
