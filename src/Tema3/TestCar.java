package Tema3;

public class TestCar {

	public static void main(String[] args) {
		
		
		Car car1 = new Car("Toyota", "electric");
		System.out.println(car1.carDetails());
		
		Car car2 = new Car("Mercedes", "diesel");
		car2.type = "sedan";
		System.out.println(car2.carDetails());
		
		System.out.println(car1.carDetails());
		
		// printurile sunt corecte fiindca valorile statice sunt asociate cu clasa si nu cu obiectul in sine (instanta)
		
	}

}
