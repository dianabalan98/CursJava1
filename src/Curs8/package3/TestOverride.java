package Curs8.package3;

public class TestOverride {

	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.draw();
		System.out.println(shape.nume);
		shape.printeaza();
		
		System.out.println("------------------------");

		Cerc cerc = new Cerc();
		cerc.draw();
		System.out.println(cerc.nume);
		cerc.printeaza();
		
		System.out.println("------------------------");

		Shape patrat = new Patrat();
		patrat.draw();
		System.out.println(patrat.nume);
		patrat.printeaza();
		
	}

}
