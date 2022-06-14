package Curs8.package1;

public class ProtectedAccessModifier {
	
	/**
	 * Scopul lui este in acelasi pachet si subclase din pachete diferite
	 * Clasele nu pot fi declarate ca si protected
	 * 
	 * same class: yes
	 * subclass in same package: yes
	 * non-subclass in same package: yes
	 * 
	 * subclass in other package: yes
	 * non-subclass in other package: no	 
	 */
	
	protected String mesaj = "Protected access";
	
	protected void printMesaj() {
		System.out.println(mesaj);
	}

	public static void main(String[] args) {
		
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		obj.printMesaj();

	}

}
