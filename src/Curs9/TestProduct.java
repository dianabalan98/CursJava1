package Curs9;

public class TestProduct {

	public static void main(String[] args) {
		
		// cannot instantiate abstract class
		//Product produs = new Product();
		
		Laptop laptop = new Laptop(2500, 19, 4);
		System.out.println("Pretul laptopului este: " + laptop.calculatePrice());
		
		MobilePhone mobilePhone = new MobilePhone(1500, 19);
		System.out.println("Pretul telefonului este: " + mobilePhone.calculatePrice());

	}

}
