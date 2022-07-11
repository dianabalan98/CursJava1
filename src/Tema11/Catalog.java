package Tema11;

import java.util.HashMap;
import java.util.Map;

public class Catalog {

	private Map<String, Double> catalogMediiFinale = new HashMap<>();
	
	public Catalog() {
		this.catalogMediiFinale.put("Ion Pop", 10.0);
		this.catalogMediiFinale.put("Maria Avram", 9.33);
		this.catalogMediiFinale.put("Iulia Nagy", 7.5);
	}
	
	public void checkIfStudentExists(String nume, Double nota) {
		
		if(this.catalogMediiFinale.containsKey(nume)) {
			
			checkGrade(nume, nota);
		} else {
			
			this.catalogMediiFinale.put(nume, nota);
			System.out.println("Nu aveai nota, ti-am trecut acum!");
		}
		
		System.out.println("------------CATALOGUL--------------");
		System.out.println(this.catalogMediiFinale + "\n");
		
	}
	
	private void checkGrade(String nume, Double notaPropusa) {
		
		if(this.catalogMediiFinale.get(nume) >= notaPropusa) {
			
			System.out.println("Nu ai nevoie de alta nota.");
		} else {
			
			this.catalogMediiFinale.replace(nume, notaPropusa);
			System.out.println("Am actualizat nota.");
		}
	}

}
