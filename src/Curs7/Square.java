package Curs7;

public class Square extends Shape{

	String shapeName = "Square";
	String shapeColor = "Negru";
	
	public Square(String color, String name) {
		this.shapeColor = color;
		this.shapeName = name;
	}
	
	public Square() {
		System.out.println("Default constructor");
	}
	
	public void displayShapeDetails() {
		System.out.println("Shape name is : " + super.shapeName + " and the color is : " + shapeColor);
	}
}
