package Curs8.package3;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.makeSound();
		
		System.out.println("---------------------");
		
		Deer bambi = new Deer();
		bambi.makeSound();
		bambi.eatGrass();
		
		System.out.println("---------------------");
		
		Lion simba = new Lion();
		simba.makeSound();
		simba.eatMeat();
		
		System.out.println("---------------------");
		
		Animal nala = new Lion();
		nala.makeSound();
		feedAnimal(nala);
		//nala.eatMeat();   // nu vede metoda
		((Lion) nala).eatMeat();  // Java intelege sa identifice doar pt aceasta linie sa identifice obiectul nala ca fiind lion nu animal

		nala = new Deer();
		nala.makeSound();
		feedAnimal(nala);
	}
	
	public static void feedAnimal(Animal obiect) {
		
		if(obiect instanceof Lion) {
			System.out.println("You are getting burgers!");
		} else if (obiect instanceof Deer) {
			System.out.println("You are getting salad!");
		}
	}

}
