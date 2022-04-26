package Curs2;

public class StaticVsNonStatic {
	
	public String prenume = "John"; // variabila de instanta
	public static String nume; // default value = null
	public static String departament = "QA";

	public static void main(String[] args) {
		
		/*System.out.println("Hello " + nume); 
		 * Cannot make a static reference to the non-static field name
		 * Context static (incarcat inaintea contextului non-static)
		 */
		
		System.out.println("Hello " + nume);  // poate fi accesat nume fiindca e static
		System.out.println("Hello " + departament);
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		System.out.println("Hello " + obj.prenume); // nu poate fi accesata decat pe baza unei instante a clasei
		
		StaticVsNonStatic person1 = new StaticVsNonStatic();
		person1.nume = "Doe";
		System.out.println("Person " + person1.prenume + " " + person1.nume + " from " + person1.departament + " department.");
		
		StaticVsNonStatic person2 = new StaticVsNonStatic();
		person2.nume = "Pop";
		person2.prenume = "Ana";
		System.out.println("Person " + person2.prenume + " " + person2.nume + " from " + departament + " department.");
		System.out.println("Person " + person1.prenume + " " + person1.nume + " from " + person1.departament + " department.");
		// static values - asociate cu clasa nu cu obiectul in sine (instanta)
		
		StaticVsNonStatic person3 = new StaticVsNonStatic();
		person2.nume = "Gigi";
		departament = "HR";
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Person " + person1.prenume + " " + person1.nume + " from " + departament + " department.");
		System.out.println("Person " + person2.prenume + " " + person2.nume + " from " + departament + " department.");
		System.out.println("Person " + person3.prenume + " " + person3.nume + " from " + departament + " department.");
	}
	
	public void printeazaNume() {
		System.out.println("Hello " + nume);
		// Context non-static
	}

}
