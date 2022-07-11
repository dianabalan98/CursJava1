package Tema10;

import java.io.IOException;
import java.util.Scanner;

public class TestVeggieShop {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		ManageStock test = new ManageStock();
		String desiredVeggie = "";
		boolean result = false;
		
		while(result != true){
			
			System.out.println("Ce leguma ai vrea sa cumperi?");
			desiredVeggie = scan.next();
			result = test.checkIfVeggieInStock(desiredVeggie);
			if(result) {
				System.out.println(test.getVeggieCalorie(desiredVeggie));
			} else {
				System.out.println("Nu vindem aceasta leguma!");
			}
		}
		
		scan.close();
	}

}
