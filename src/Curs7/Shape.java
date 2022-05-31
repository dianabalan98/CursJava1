package Curs7;

public class Shape {

	String shapeName = "generic shape";
	String shapeColor = "generic color";
	
	// constructor
	/*public Shape(String color, String name) {
		this.shapeColor = color;
		this.shapeName = name;
	}*/
	
	// metode
	public void displayShapeDetails() {
		System.out.println("Shape name is : " + shapeName + " and the color is : " + shapeColor);
	}
	
}
