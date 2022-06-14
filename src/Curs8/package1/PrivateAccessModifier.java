package Curs8.package1;

public class PrivateAccessModifier {
	
	/**
	 * Nu putem defini clasa sau interfata ca fiind "private"
	 * Scopul este limitat la clasa in care se afla
	 * 
	 * same class: yes
	 * subclass in same package: no
	 * non-subclass in same package: no
	 * 
	 * subclass in other package: no
	 * non-subclass in other package: no	 
	 * 
	 */
	
	private String mesaj = "Private access";
	
	// putem face constructorul privat doar daca vrem sa nu poata fi instantiata clasa in alte clase
	// dar atunci ar fi bine sa facem metodele clasei ca fiind statice
	private PrivateAccessModifier() {}
	
	private void printMesaj() {
		System.out.println(mesaj);
	}

	public static void main(String[] args) {
		
		PrivateAccessModifier obj = new PrivateAccessModifier();
		obj.printMesaj();

	}

}
