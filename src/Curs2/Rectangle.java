package Curs2;

public class Rectangle {

	// variabile de clasa
	private int length;
	private int width;
	private String name;
	
	public Rectangle() { // constructorul de baza e suprascris astfel
		length = 5; // ia valoarea 5 mereu pt length
	}
	
	// teoretic daca folosim setterul in constructorul atunci ar trebui setati private
	// putem sa si atribuim direct prin this.numeVariabila = valoare;
	public Rectangle(int num1, int num2) {
		setLength(num1);
		setWidth(num2);
	}
	
	public Rectangle(int num1, int num2, String Name) {
		setLength(num1);
		setWidth(num2);
		name = Name;
	}
	
	public int calculateTotal() {
		// variabila locala
		int total = this.length + this.width;
		return total;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
