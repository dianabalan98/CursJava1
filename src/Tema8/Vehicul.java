package Tema8;

public class Vehicul {
	
	private String brand;
	private int nivelPoluare;
	private int vitezaMedie;
	
	public Vehicul(String brand, int nivelPoluare, int vitezaMedie) {
		setBrand(brand);
		setNivelPoluare(nivelPoluare);
		setVitezaMedie(vitezaMedie);
	}
	
	public String nume() {
		return "Nume din clasa parinte Vehicul";
	}
	
	public String motorizare() {
		return "Motorizare din clasa parinte Vehicul";
	}
	
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru masina " + brand + " este: " + nivelPoluare + " si"
				+ " viteza medie atinsa este de " + vitezaMedie + " km/h.");
	}

	public String getBrand() {
		return brand;
	}

	private void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNivelPoluare() {
		return nivelPoluare;
	}

	private void setNivelPoluare(int nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}

	public int getVitezaMedie() {
		return vitezaMedie;
	}

	private void setVitezaMedie(int vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}
	
	

}
