package Curs8.package3;

public class Patrat extends Shape{

	String nume = "patrat";
	
	// suprascriere de metoda
	@Override
	public void draw() {
		System.out.println("Patrat class");
		System.out.println("Deseneaza un patrat");
	}
}
