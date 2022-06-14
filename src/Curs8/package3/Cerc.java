package Curs8.package3;

public class Cerc extends Shape{

	String nume = "cerc";
	
	// suprascriere de metoda
	@Override
	public void draw() {
		System.out.println("Cerc class");
		System.out.println("Deseneaza un cerc");
	}
}
