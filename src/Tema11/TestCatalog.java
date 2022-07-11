package Tema11;

public class TestCatalog {

	public static void main(String[] args) {
		
		Catalog catalog = new Catalog();
		
		// elev care nu exista
		catalog.checkIfStudentExists("Ovidiu Pop", 8.66);
		
		// elev care exista dar cu nota mai mica
		catalog.checkIfStudentExists("Ion Pop", 9.5);
		
		// elev care exista dar cu nota mai mare
		catalog.checkIfStudentExists("Maria Avram", 9.7);
		
		// elev care exista dar cu aceeasi nota
		catalog.checkIfStudentExists("Iulia Nagy", 7.5);

	}

}
