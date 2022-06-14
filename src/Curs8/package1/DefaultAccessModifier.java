package Curs8.package1;

class DefaultAccessModifier {
	
	/**
	 * daca nu mentionam niciun access modifier se considera default
	 * scopul sau e limitat doar la pachetul in care se afla
	 * 
	 * same class: yes
	 * subclass in same package: yes
	 * non-subclass in same package: yes
	 * 
	 * subclass in other package: no
	 * non-subclass in other package: no
	 */
	
	String mesaj;
	
	void printMesaj() {
		System.out.println("Default modifier");
	}
	
	

}
