package Curs9;

public class Exception1 {

	public static void main(String[] args) throws InterruptedException {
		
		String[] week = {"L", "M", "Mi", "J", "V", "S", "D"};
		
		for(String day : week) {
			
			Thread.sleep(2000);
			System.out.println(day);
		}

	}

}
