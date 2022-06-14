package Curs9;

public class TestInterface {

	public static void main(String[] args) {
		
		// cannot instantiate interface
		//Angajat angajat = new Angajat();
		
		Tester tester = new Tester();
		tester.setName("Oana");
		tester.setEmail("oana@mail.com");
		System.out.println(tester.getName());
		System.out.println(tester.getEmail());
		System.out.println(tester.getDepartment());

	}

}
