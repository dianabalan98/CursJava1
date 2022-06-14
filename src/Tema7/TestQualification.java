package Tema7;

public class TestQualification {

	public static void main(String[] args) {
		
		Qualification q1 = new Qualification("Java", 4, "Afternoon");
		Qualification q2 = new Qualification("C++", 4, "Afternoon");
		Qualification q3 = new Qualification("Java", 3, "Afternoon");
		Qualification q4 = new Qualification("Java", 4, "Morning");
		
		q1.verify();
		q2.verify();
		q3.verify();
		q4.verify();

	}

}
