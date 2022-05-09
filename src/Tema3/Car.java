package Tema3;

public class Car {
	
	public static String brand;
	public static String type = "Suv";
	public static String engine;
	
	public Car(String brand, String engine) {
		Car.brand = brand;
		Car.engine = engine;
	}
	
	public static String carDetails() {
		return "All " + brand + " cars are " + engine + " and are of type " + type;
	}

}
